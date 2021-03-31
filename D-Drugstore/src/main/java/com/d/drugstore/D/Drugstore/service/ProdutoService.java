package com.d.drugstore.D.Drugstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d.drugstore.D.Drugstore.model.Produtos;
import com.d.drugstore.D.Drugstore.repository.CategoriasRepositoy;
import com.d.drugstore.D.Drugstore.repository.ProdutosRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutosRepository repository;

	@Autowired
	CategoriasRepositoy categoriaRepositoy;

	public Produtos cadastrarProduto(Produtos produto) {

		List<Produtos> produtos = repository.findAll();

		int last = produtos.size() - 1;

		if (produtos.size() != 0) {

			produto.setPLU(produtos.get(last).getPLU() + 1);
			repository.save(produto);

		} else {
			produto.setPLU(1);
			repository.save(produto);
		}

		return produto;
	}

	public Produtos cadastrarProdutoDiferentao(Produtos produto) {

		if (produto.getCategorias().getId() == 1) {
			produto.setPLU(1);

		} else if (produto.getCategorias().getId() == 2) {

			produto.setPLU(2);
		} 
		//incluir o restante das possiveis PLUs

		return produto;

	}

}
