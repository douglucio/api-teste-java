package net.ronaldoreis.api.entity.form;

import org.springframework.lang.Nullable;

public class PessoaForm {
	
	@Nullable
	private String nome;
	
	@Nullable
	private String dataDeNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	

}
