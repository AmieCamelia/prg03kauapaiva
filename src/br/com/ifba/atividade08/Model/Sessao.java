/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.Model;

/**
 *
 * @author kpaiv
 */
import java.time.LocalDateTime;

//Para configurar a sessão do usuario dentro do sistema.
public class Sessao {
    //Id da sessão, pode ser util se quisemos verificar uma sessão feita no passado.
    private Long id;
    //para informar qual usuario está na sessão.
    private Usuario usuario;
    //Token funcionaria como uma chave de segurança temporaria para quem está usando a sessão.
    private String token;
    
    //para que no main consigamos inserir todos os detalhes da sessão.
    public Sessao(Long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    @Override
    public String toString() {
        return "Sessao ID: " + id + " | Token: " + token + " | Usuario: " + usuario.getNomeUsuario();
    }
}