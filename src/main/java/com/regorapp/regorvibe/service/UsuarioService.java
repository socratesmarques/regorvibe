package com.regorapp.regorvibe.service;

import com.regorapp.regorvibe.model.Usuario;
import com.regorapp.regorvibe.repository.UsuarioRepository;
public class UsuarioService {
    private final UsuarioRepository repository = new UsuarioRepository();
    public boolean autenticar(String email,String senha){
        Usuario usuario = repository.buscarPorEmail(email);
        if(usuario == null){
            return false;
        }
        return usuario.getSenha().equals(senha);
    }
}
