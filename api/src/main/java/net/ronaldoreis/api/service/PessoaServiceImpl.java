package net.ronaldoreis.api.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ronaldoreis.api.entity.Endereco;
import net.ronaldoreis.api.entity.Pessoa;
import net.ronaldoreis.api.entity.form.PessoaForm;
import net.ronaldoreis.api.entity.form.PessoaUpdateForm;
import net.ronaldoreis.api.infra.utils.JavaTimeUtils;
import net.ronaldoreis.api.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements IPessoaService {
	
	@Autowired
	private PessoaRepository repository;

	@Override
	public Pessoa create(PessoaForm form) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(form.getNome());
		LocalDate localDate = LocalDate.parse(form.getDataDeNascimento(), JavaTimeUtils.LOCAL_DATE_FORMATTER);
		pessoa.setDataDeNascimento(localDate);
		repository.save(pessoa);

		return pessoa;
	}

	@Override
	public Pessoa get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Pessoa update(Long id, PessoaUpdateForm form) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(form.getId());
		pessoa.setNome(form.getNome());
		LocalDate localDate = LocalDate.parse(form.getDataDeNascimento(), JavaTimeUtils.LOCAL_DATE_FORMATTER);
		pessoa.setDataDeNascimento(localDate);
		repository.save(pessoa);

		return pessoa;
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);

	}

	public List<Endereco> getAllEnderecoId(Long id) {
		Pessoa pessoa = repository.findById(id).get();

		return pessoa.getEnderecos();
	}

	@Override
	public List<Pessoa> getAll() {
		
		return repository.findAll();
	}

	public Optional<Pessoa> findById(Long id) {
		return repository.findById(id);
	}
	
	

	

}
