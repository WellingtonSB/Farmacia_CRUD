package com.d.drugstore.D.Drugstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d.drugstore.D.Drugstore.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
	public List<Produtos> findAllByNomeContainingIgnoreCase(String nome);
}
