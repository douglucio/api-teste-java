package net.ronaldoreis.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ronaldoreis.api.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
