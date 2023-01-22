package net.ronaldoreis.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ronaldoreis.api.entity.Endereco;
import net.ronaldoreis.api.entity.Pessoa;
import net.ronaldoreis.api.entity.form.EnderecoForm;
import net.ronaldoreis.api.entity.form.EnderecoUpdateForm;
import net.ronaldoreis.api.repository.EnderecoRepository;
import net.ronaldoreis.api.repository.PessoaRepository;

@Service
public class EnderecoServiceImpl implements IEnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public Endereco create(EnderecoForm form) {
		Endereco endereco = new Endereco();
		Pessoa pessoa = pessoaRepository.findById(form.getPessoaId()).get();
		
		endereco.setPessoa(pessoa);
		endereco.setLogradouro(form.getLogradouro());
		endereco.setCep(form.getCep());
		endereco.setNumero(form.getNumero());
		endereco.setCidade(form.getCidade());
		endereco.setPrincipal(form.getPrincipal());
		
		return enderecoRepository.save(endereco);
	}

	@Override
	public Endereco get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Endereco> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Endereco update(Long id, EnderecoUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		enderecoRepository.deleteById(id);
		
	}

}
