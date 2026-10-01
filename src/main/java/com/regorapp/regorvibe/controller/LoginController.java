package com.regorapp.regorvibe.controller;

import com.regorapp.regorvibe.service.UsuarioService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField campoEmail;

    @FXML
    private PasswordField campoSenha;

    @FXML
    private Label mensagem;

    private final UsuarioService usuarioService = new UsuarioService();

    @FXML
    private void entrar() {

        String email = campoEmail.getText().trim();
        String senha = campoSenha.getText();

        if (email.isEmpty() || senha.isEmpty()) {
            mensagem.setText("Preencha todos os campos.");
            return;
        }

        boolean autenticado = usuarioService.autenticar(email, senha);

        if (autenticado) {
            mensagem.setText("Login realizado com sucesso!");
        } else {
            mensagem.setText("Email ou senha incorretos.");
        }
    }
}