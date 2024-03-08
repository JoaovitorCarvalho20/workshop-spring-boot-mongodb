package com.workshopMongodb.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.workshopMongodb.domain.Usuarios;
import com.workshopMongodb.service.UsuariosService;

@RestController
@RequestMapping(value = ("/usuarios"))
public class UsuariosResource {

	@Autowired
	private UsuariosService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List <Usuarios>> findAll() {
        
        List<Usuarios> lista = service.FindAll();
        return ResponseEntity.ok().body(lista);
    }
}
