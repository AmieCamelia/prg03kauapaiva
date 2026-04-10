/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

/**
 *
 * @author kpaiv
 */
public class Fatorial {
    //apenas redefine as variaveis importantes.
    public void setValor(int n) {
        num = n;
        fatorial = 1;
        formula = "";
    }
    
    public int getFatorial () {
        //cria algumas variaveis temporarias para serem trabalhadas internamente.
        int s = 1;
        String f = "";
        
        //como sabemos 1 e 0 tem o mesmo resultado ao fatorar, logo caso o usuario escolha um dos 2, o codigo retorna 1.
        if (num == 0 || num == 1) {
            fatorial = 1;
            formula = num + "! = 1";
            return 1;
        }
        
        //caso o if anterior não ocorra, o for abaixo ocorre, começando do numero em que o usuario inserir graças a num.
        for (int i = num; i > 1; i--) {
            //a variavel S multiplica com o i atual e já modifica seu valor.
            s *= i;
            //adiciona um texto a mais para a string, será util ao mostrar a conta na interface.
            f += i + " * ";
        }
        
        //passa os resultados trabalhados para as variaveis privadas.
        fatorial = s;
        formula = f + "1 = " + fatorial;
        
        //retorna pro codigo o valor final da fatoração.
        return fatorial;
    }
    
    public String getFormula () {
        //retorna a string privada que contem a demonstração da conta.
        return formula;
    }
    
    //variaveis para a fatorial
    private int num = 1;
    private int fatorial = 1;
    private String formula = "";
    //fim das variaveis
    
}
