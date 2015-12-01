/*package com.example.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entidades.Aluno;
import com.example.entidades.Cidade;
import com.example.repositorios.NomeRepositorio;

@Controller
public class NomeControler {
	@Autowired
	NomeRepositorio nomeRepositorio;
	@RequestMapping(value = "/nome")
	public String lista(Cidade cidade, Model model) {
		model.addAttribute("nomes",nomeRepositorio.findAll());
		if (cidade.getId() != null) {
			model.addAttribute("nomes",nomeRepositorio.findOne(cidade.getId()));
		} else {
			model.addAttribute("nome", new Cidade());
		}
		return "nome";
	}

	@RequestMapping(value = "/nome/save")
	public String salvar(Aluno aluno) {
		nomeRepositorio.save(aluno);
		return "redirect:/nome";
	}

	@RequestMapping(value = "/nome/del")
	public String deletar(Aluno aluno) {
		nomeRepositorio.delete(aluno);
		return "redirect:/nome";
	}
}*/

