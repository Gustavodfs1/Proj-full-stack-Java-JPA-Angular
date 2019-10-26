package com.gustavodfs.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gustavodfs.cursomc.domain.Categoria;
import com.gustavodfs.cursomc.dto.CategoriaDTO;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	@Query("select new com.gustavodfs.cursomc.dto.CategoriaDTO(c.nome, c.id) from Categoria c")
	public List<CategoriaDTO> findAlltest();
	
	
}
