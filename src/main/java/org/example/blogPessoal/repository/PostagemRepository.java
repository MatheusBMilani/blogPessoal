package org.example.blogPessoal.repository;

import java.util.List;

import org.example.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	// select * from tb_postagens where titulo like "%titulo%";
}