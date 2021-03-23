package com.d.drugstore.D.Drugstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d.drugstore.D.Drugstore.model.Categorias;

public interface CategoriasRepositoy extends JpaRepository<Categorias, Long> {
	public List<Categorias> findAllByNomeContainingIgnoreCase(String nome);
}
