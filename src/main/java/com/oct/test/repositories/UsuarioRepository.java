package com.oct.test.repositories;

import java.util.ArrayList;

import com.oct.test.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>{

}