/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.Model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author kpaiv
 */
//
public class LogAuditoria {
    private Long id;
    //para receber os dados de usuario.
    private Usuario usuario;
    private String acao;
    //usa uma biblioteca para criar uma variavel que verifica o horario em que se foi feito o ultimo login.
    private LocalDateTime dataHora;
    private String ip;

    //atualiza os dados de LogAuditoria a partir do que for informado na main.
    public LogAuditoria(Long id, Usuario usuario, String acao, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = LocalDateTime.now();
        this.ip = ip;
    }

    @Override
    public String toString() {
        //Para melhorar a visualização da data, modificamos seu formato.
        DateTimeFormatter formatoBonito = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");

        // 2. Formatamos a nossa variável dataHora
        String dataFormatada = this.dataHora.format(formatoBonito);
        //Retorna um texto todo para que seja digitado em diferentes ordens na main com maior liberdade.
        return "[Data de ultimo login: " + dataFormatada + "] Acao: " + acao + " | Usuario: " + usuario.getNomeUsuario() + " | IP: " + ip;
    }
}