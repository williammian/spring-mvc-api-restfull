package br.com.wm.springmvcapirestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.springmvcapirestful.model.Contato;

public interface Contatos extends JpaRepository<Contato, Long> {

}
