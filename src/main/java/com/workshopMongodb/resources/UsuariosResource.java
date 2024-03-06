package com.workshopMongodb.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.workshopMongodb.domain.Usuarios;

@RestController
@RequestMapping(value = ("/usuarios"))
public class UsuariosResource {
	//
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List <Usuarios>> findAll() {
        
        Usuarios joao = new Usuarios("1", "joao", "joao@teste");
        Usuarios vitor = new Usuarios("2", "vitor", "vitor@teste");
        List<Usuarios> lista = new ArrayList<>();
        lista.addAll(List.of(joao, vitor));
        return ResponseEntity.ok().body(lista);
    }
}
