package com.gustavodfs.cursomc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gustavodfs.cursomc.domain.Cliente;
import com.gustavodfs.cursomc.dto.ClienteDTO;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	
	
	
}
