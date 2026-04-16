/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.model;

/**
 *
 * @author kpaiv
 */

// A Interface que define o contrato
interface Pagamento3 {
    float calcularTotal();
}

// Classe Dinheiro: 10% de desconto
public class PagamentoPix implements Pagamento3 {
    //cria private para gerir valor.
    private float valor;
    
    //atualiza o valor.
    public PagamentoPix(float valor) {
        this.valor = valor;
    }

    @Override
    public float calcularTotal() {
        //transforma o valor no cashback.
        return (float) (this.valor * 0.02); // 2% CashBack.
    }
}