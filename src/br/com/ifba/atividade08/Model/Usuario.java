/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.Model;

import java.time.LocalDateTime;
import java.util.UUID;
/**
 *
 * @author kpaiv
 */
public class Usuario {
    private Long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private Boolean ativo;

    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ativo = true;
    }

    // Métodos Opcionais solicitados
    public boolean logar(String senhaInformada) {
        if (this.senha.equals(senhaInformada)) {
            this.ultimoLogin = LocalDateTime.now();
            System.out.println("Login realizado com sucesso para: " + nomeUsuario);
            return true;
        }
        return false;
    }

    public Sessao criarSessao() {
        //Gera um token aleatorio.
        String token = UUID.randomUUID().toString();
        return new Sessao(1L, this, token);
    }

    // Getters e Setters
    public Long getId() { return id; }
    public PerfilUsuario getPerfil() { return perfil; }
    public String getNomeUsuario() { return nomeUsuario; }
    public LocalDateTime getUltimoLogin() { return ultimoLogin; }

    @Override
    public String toString() {
        return "Usuario: " + nomeUsuario + " (" + email + ") - Ativo: " + ativo;
    }
}