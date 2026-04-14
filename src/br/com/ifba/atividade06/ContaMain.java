/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06;
import java.util.Scanner;
/**
 *
 * @author kpaiv
 */
public class ContaMain {
    public static void main(String[] args) {
        //cria uma variavel do tipo ContaBancaria para permitir gerir os metodos da outra classe.
        ContaBancaria conta = new ContaBancaria();
        //cria um scanner para ler o que o usuario digitar no terminal, permitindo atualizar livremente nesse codigo a sua conta.
        Scanner teclado = new Scanner(System.in);
        
        //algumas variaveis basicas.
        int loop = 1, option, num = 0, deposito, sacar;
        String tipo, dono;
        
        //abaixo possui um menu que estará sempre rodando, caso o usuario queira sair o valor que faz o loop existir muda, cancelando-o.
        do {
            System.out.println("*--- Boas vindas o que deseja fazer? ---*");
            System.out.println("|1 - Abrir conta                        |");
            System.out.println("|2 - Fechar conta                       |");
            System.out.println("|3 - Depositar dinheiro na conta        |");
            System.out.println("|4 - sacar dinheiro na conta            |");
            System.out.println("|5 - Pagar mensal                       |");
            System.out.println("|6 - Verificar dados na conta           |");
            System.out.println("|0 - Sair do programa                   |");
            System.out.println("*---------------------------------------*");
            System.out.println("Por favor escolha uma opcao: ");
            //ler usando o scanner qual opção o usuario escolheu.
            option = teclado.nextInt();
            //um limpador de buffer caso algum "/n" esteja escondigo, pois ele pode impedir o codigo de funcionar.
            teclado.nextLine();
            
            //comando que analisa qual valor de opção escolheu assim executando o codigo da respectiva opção.
            switch (option) {
                case 0:
                    //quebra o loop 
                    loop = 0;
                    //breaks param o case atual para que não precisem ver as proximas.
                    break;
                case 1:
                    //aqui o usario pode digitar os dados pedidos.
                    System.out.println("Por favor informe o tipo de conta (cc para corrente e cp para poupanca: ");
                    tipo = teclado.nextLine();
                    System.out.println("Por favor informe o seu nome: ");
                    dono = teclado.nextLine();
                    //cria um novo codigo para referir ao usuario.
                    num++;
                    //chama o metodo para criar a nova conta.
                    conta.abrirConta(tipo, dono, num);
                    break;
                case 2:
                    //os comandos seguintes seguem o mesmo padrão.
                    conta.fecharConta();
                    break;
                case 3:
                    System.out.println("Por favor informe quanto vai depositar: ");
                    deposito = teclado.nextInt();
                    conta.depositar(deposito);
                    break;
                case 4:
                    System.out.println("Por favor informe quanto vai sacar: ");
                    sacar = teclado.nextInt();
                    conta.sacar(sacar);
                    break;
                case 5:
                    conta.pagarMensal();
                    break;
                case 6:
                    //se o status for true logo existe uma conta então podemos ver os dados dela.
                    if(conta.verifStatus()) {
                        //usa os gets para receber todos os dados da conta atuais.
                        System.out.println("Tipo de conta: " + conta.getTipo());
                        System.out.println("Nome do usuario: " + conta.getDono());
                        System.out.println("Saldo atual: " + conta.getSaldo());
                        System.out.println("Codigo do cliente: " + conta.getNumConta());
                    }
                    break;
                default:
                    System.out.println("Opção escolhida invalida! tente novamente...");
            }
            
            
            //System.out.println();
        } while (loop == 1);
        System.out.println("\nSaindo com sucesso...");
    }
}
