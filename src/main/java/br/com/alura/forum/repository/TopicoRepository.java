package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepositoryImplementation<Topico, Long> {

}
