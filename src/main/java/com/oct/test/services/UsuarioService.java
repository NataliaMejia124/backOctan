package com.oct.test.services;

import com.oct.test.repositories.UsuarioRepository;


import java.util.ArrayList;
// import java.util.Optional;

import com.oct.test.models.UsuarioModel;
import com.oct.test.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService{
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>)usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
    
    public boolean eliminarUsuario(Integer id_usuario) {
        try{
            usuarioRepository.deleteById(id_usuario);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}