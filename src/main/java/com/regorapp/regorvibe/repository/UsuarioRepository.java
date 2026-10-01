package com.regorapp.regorvibe.repository;

import com.regorapp.regorvibe.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private final List<Usuario> usuarios = new ArrayList<>();

    public UsuarioRepository(){
        usuarios.add(new Usuario("teste@gmail.com", "12345"));
        usuarios.add(new Usuario("teste2@gmail.com", "54321"));
    }
    public Usuario buscarPorEmail(String email){
        for(Usuario usuario : usuarios){
            if(usuario.getEmail().equalsIgnoreCase(email)){
                return usuario;
            }
        }
        return null;
    }
}
