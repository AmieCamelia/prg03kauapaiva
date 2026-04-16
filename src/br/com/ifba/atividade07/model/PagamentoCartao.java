/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.model;

/**
 *
 * @author kpaiv
 */

// A Interface que define o contrato.
interface Pagamento2 {
    float calcularTotal();
}

// Classe Dinheiro: 10% de desconto.
public class PagamentoCartao implements Pagamento2 {
    //cria private para gerir valor.
    private float valor;
    
    //atualiza o valor.
    public PagamentoCartao(float valor) {
        this.valor = valor;
    }

    @Override
    public float calcularTotal() {
        //adiciona taxa no valor inicial.
        return (float) (this.valor * 1.05); // 5% taxa.
    }
}