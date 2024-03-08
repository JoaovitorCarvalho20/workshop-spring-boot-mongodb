package com.workshopMongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.workshopMongodb.domain.Usuarios;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuarios, String> {

}
