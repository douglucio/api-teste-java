package net.ronaldoreis.api.service;

import java.util.List;

import net.ronaldoreis.api.entity.Endereco;
import net.ronaldoreis.api.entity.Pessoa;
import net.ronaldoreis.api.entity.form.PessoaForm;
import net.ronaldoreis.api.entity.form.PessoaUpdateForm;

public interface IPessoaService {
	
	/**
	   * Cria uma Pessoa e salva no banco de dados.
	   * @param form - formulário referente aos dados para criação de uma Pessoa no banco de dados.
	   * @return - Pessoa recém-criada.
	   */
	  Pessoa create(PessoaForm form);

	  /**
	   * Retorna uma Pessoa que está no banco de dados de acordo com seu Id.
	   * @param id - id da Pessoa que será exibido.
	   * @return - Pessoa de acordo com o Id fornecido.
	   */
	  Pessoa get(Long id);

	  /**
	   * Retorna todos as Pessoas que estão no banco de dados.
	   * @return - Uma lista as Pessoas que estão salvas no DB.
	   */
	  List<Pessoa> getAll();

	  /**
	   * Atualiza a Pessoa.
	   * @param id - id dA Pessoa que será atualizado.
	   * @param formUpdate - formulário referente aos dados necessários para atualização da Pessoa
	   * no banco de dados.
	   * @return - Pessoa recém-atualizada.
	   */
	  Pessoa update(Long id, PessoaUpdateForm formUpdate);

	  /**
	   * Deleta uma Pessoa específica.
	   * @param id - id da Pessoa que será removida.
	   */
	  void deleteById(Long id);
	  
	  /**
	   * Retorna todos os Enderecos que estão no banco de dados para o Id informado.
	   * @return - Uma lista de Enderecos que estão salvas no DB.
	   */
	  List<Endereco> getAllEnderecoId(Long id);

	  

}
