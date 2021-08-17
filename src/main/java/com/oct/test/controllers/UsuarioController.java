package com.oct.test.controllers;

import com.oct.test.models.UsuarioModel;
import com.oct.test.services.UsuarioService;

import java.util.ArrayList;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/usuario")
public class UsuarioController{
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping( path = "/{id_usuario}")
    public String eliminarPorId(@PathVariable("id_usuario") Integer id_usuario){
        boolean ok = this.usuarioService.eliminarUsuario(id_usuario);
        if (ok){
            return "Se eliminó el usuario con id " + id_usuario;
        }else{
            return "No pudo eliminar el usuario con id" + id_usuario;
        }
    }
}