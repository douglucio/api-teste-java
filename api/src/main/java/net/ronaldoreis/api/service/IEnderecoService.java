package net.ronaldoreis.api.service;

import java.util.List;

import net.ronaldoreis.api.entity.Endereco;
import net.ronaldoreis.api.entity.form.EnderecoForm;
import net.ronaldoreis.api.entity.form.EnderecoUpdateForm;

public interface IEnderecoService {
	
	/**
	 * Cria um Endereco e salva no banco de dados.
	 * 
	 * @param form - formulário referente aos dados para criação do Endereco
	 *             no banco de dados.
	 * @return - Endereco recém-criado.
	 */
	Endereco create(EnderecoForm form);

	/**
	 * Retorna um Endereco que está no banco de dados de acordo com seu Id.
	 * 
	 * @param id - id do Endereco que será exibida.
	 * @return - Endereco de acordo com o Id fornecido.
	 */
	Endereco get(Long id);

	/**
	 * Retorna todos os Enderecos que estão no banco de dados.
	 * 
	 * @return - Uma lista com todos os Enderecos que estão salvos no DB.
	 */
	List<Endereco> getAll();

	/**
	 * Atualiza o Endereco.
	 * 
	 * @param id         - id da Endereco que será atualizado.
	 * @param formUpdate - formulário referente aos dados necessários para
	 *                   atualização do Endereco no banco de dados.
	 * @return - Endereco recém-atualizado.
	 */
	Endereco update(Long id, EnderecoUpdateForm formUpdate);

	/**
	 * Deleta um Endereco específico.
	 * 
	 * @param id - id do Endereco que será removido.
	 */
	void delete(Long id);

}
