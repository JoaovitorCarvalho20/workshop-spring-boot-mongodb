package com.workshopMongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.workshopMongodb.domain.Usuarios;
import com.workshopMongodb.repository.UsuarioRepository;

@Service
public class UsuariosService {

	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuarios> FindAll(){
		return repository.findAll();
	}
}
