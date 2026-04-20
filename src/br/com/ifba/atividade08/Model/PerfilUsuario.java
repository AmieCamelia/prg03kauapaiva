/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.Model;

/**
 *
 * @author kpaiv
 */
import java.util.List;

//Aqui definimos qual o tipo de usuario.
public class PerfilUsuario {
    //Cria o id do tipo de perfil.
    private Long id;
    //Informa que tipo de perfil é este.
    private String descricao;
    //Como a depender do usuario ele pode ter mais de uma permissão, então temos que usar uma Lista para juntar todas.
    private List<String> permissoes;
    
    //para que no main seja possivel inserir as caracteristicas.
    public PerfilUsuario(Long id, String descricao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public List<String> getPermissoes() { return permissoes; }
    public void setPermissoes(List<String> permissoes) { this.permissoes = permissoes; }

    @Override
    //para poder inserir um print em qualquer parte do main.
    public String toString() {
        return "Perfil: " + descricao + " | Permissoes: " + permissoes;
    }
}
