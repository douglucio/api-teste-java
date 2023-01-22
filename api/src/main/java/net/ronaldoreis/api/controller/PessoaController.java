package net.ronaldoreis.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.ronaldoreis.api.entity.Endereco;
import net.ronaldoreis.api.entity.Pessoa;
import net.ronaldoreis.api.entity.form.PessoaForm;
import net.ronaldoreis.api.entity.form.PessoaUpdateForm;
import net.ronaldoreis.api.service.PessoaServiceImpl;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaServiceImpl service;
	
	@GetMapping
	public List<Pessoa> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getPessoaById(@PathVariable Long id) {
		Optional<Pessoa> pessoa = service.findById(id);
		if (pessoa.isPresent()) {
			return ResponseEntity.ok(service.findById(id));
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping
	public Pessoa create(@Validated @RequestBody PessoaForm form) {
		return service.create(form);
	}
	
	@PutMapping("/{id}")
	public Pessoa updatePessoa(@PathVariable Long id, @RequestBody PessoaUpdateForm form) {
		return service.update(id,form);
	}
	
	@GetMapping("/enderecos/{id}")
	public List<Endereco> getAllEnderecoId(@PathVariable Long id) {
		return service.getAllEnderecoId(id);
	}
	
	@DeleteMapping("/{id}")
	  void delete(@PathVariable Long id) {
		service.deleteById(id);
	  }

}
