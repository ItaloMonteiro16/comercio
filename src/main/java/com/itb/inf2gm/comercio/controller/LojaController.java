package com.itb.inf2gm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2gm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")

public class LojaController {
	@GetMapping("/listar")
	public String listarProdutos(Model model) {
		
		// array com capacidade flexível
		
		List<Produto> listaDeProdutos = new ArrayList<Produto>();
		
		Produto p1 = new Produto();
		
		p1.setId(20l);
		p1.setNome("máquina de lavar");
		p1.setDescricao("máquina de lavar brastemp 13l com painel digital");
		p1.setCodigoBarra("GJRFGB515DFT5121");
		p1.setPreco(3574.52);
		
		Produto p2 = new Produto();
		
		p1.setId(20l);
		p1.setNome("micro-ondas");
		p1.setDescricao("micro-ondas eletrolux multuso");
		p1.setCodigoBarra("DTRHY81984SFERUX");
		p1.setPreco(2431.67);
		
		// guardando os produtos no array
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		// passando a lista de produtos para o front-end
		model.addAttribute("listaDeProdutos", listaDeProdutos);
		
		
		return "produtos";
	}
}
