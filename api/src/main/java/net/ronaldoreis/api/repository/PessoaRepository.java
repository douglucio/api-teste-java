package net.ronaldoreis.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.ronaldoreis.api.entity.Pessoa;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {
	
	

}
