/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import br.com.ifba.atividade08.Model.LogAuditoria;
import br.com.ifba.atividade08.Model.PerfilUsuario;
import br.com.ifba.atividade08.Model.Sessao;
import br.com.ifba.atividade08.Model.Usuario;
import java.util.Arrays;

/**
 *
 * @author kpaiv
 */
public class Main {
    public static void main(String[] args) {
        // 1. Criar Perfil do usuario, veja que temos um 1L que define para o compilador que isto é um long e nao um int.
        //Arrays é a forma de se criar uma lista.
        PerfilUsuario adminPerfil = new PerfilUsuario(1L, "Administrador", Arrays.asList("READ", "WRITE", "DELETE"));

        // 2. Criar Usuário.
        Usuario user = new Usuario(101L, adminPerfil, "joao_dev", "joao@email.com", "senha123");

        // 3. Simular Ações e Logs.
        System.out.println("--- Teste de Sistema ---");
        System.out.println(user);

        if (user.logar("senha123")) {
            // Criar Log de Auditoria
            LogAuditoria log = new LogAuditoria(1L, user, "Login realizado", "192.168.0.1");
            System.out.println(log);

            // Criar Sessão.
            Sessao sessao = user.criarSessao();
            System.out.println(sessao);
        }

        System.out.println("--- Fim do Teste ---");
    }
}