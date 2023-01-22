package net.ronaldoreis.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ronaldoreis.api.entity.Endereco;
import net.ronaldoreis.api.entity.form.EnderecoForm;
import net.ronaldoreis.api.service.EnderecoServiceImpl;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoServiceImpl service;
	
	@PostMapping
	public Endereco create(@RequestBody EnderecoForm form) {
		return service.create(form);
	}
	
	@DeleteMapping("/{id}")
	  void delete(@PathVariable Long id) {
		service.delete(id);
	  }
}
