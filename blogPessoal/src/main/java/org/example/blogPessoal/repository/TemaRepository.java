package org.example.blogPessoal.repository;

import java.util.List;

import org.example.blogPessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long>{

	public List<Tema>findAllByDescricaoContainingIgnoreCase(String descricao);
}
