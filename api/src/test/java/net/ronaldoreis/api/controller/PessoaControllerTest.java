package net.ronaldoreis.api.controller;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.ronaldoreis.api.entity.form.PessoaForm;


public class PessoaControllerTest {
	
	private MockMvc mockMvc;
	
	@Autowired
	private PessoaController pessoaController;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(pessoaController).build();
	}
	
	@Test
	public void criarPessoaComDadosCorretos_RetornarStatusCode200() throws Exception{
		PessoaForm pessoa = new PessoaForm();
		pessoa.setNome("Fulano");
		pessoa.setDataDeNascimento("12/05/1999");
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper.writeValueAsString(pessoa);
		
		this.mockMvc.perform(MockMvcRequestBuilders.post("/pessoas")
								.contentType(MediaType.APPLICATION_JSON)
								.content(json)
							)
						.andExpect(MockMvcResultMatchers.status().isBadRequest())
						.andExpect(MockMvcResultMatchers.header()
								.string("location", Matchers.containsString("http://localhost:8080/pessoas")));
	}
	
	@Test
	public void criarUsuarioComDadosIncorretos_RetornarStatusCode400() throws Exception{		
		this.mockMvc.perform(MockMvcRequestBuilders.post("/pessoas")
								.contentType(MediaType.APPLICATION_JSON)
								.content("")
							)
						.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

}
