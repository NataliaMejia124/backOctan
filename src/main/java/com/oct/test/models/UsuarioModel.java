package com.oct.test.models;
import javax.persistence.*;


@Entity
@Table (name="usuario")

public class UsuarioModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_usuario;

    private Integer id_rol;
    private String nombre;
    private String activo;

    public void setActivo(String activo){
        this.activo = activo;
    }

    public String getActivo(){
        return activo;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getId_rol() {
        return id_rol;
    }

    public void setId_rol(Integer id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}