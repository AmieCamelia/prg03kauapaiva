/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06;

/**
 *
 * @author kpaiv
 */
public class ContaBancaria {
    //metodo constructor que reinicia alguns dados importantes quando o codigo abre
    public ContaBancaria() {
        this.setSaldo(0);
        this.setStatus(false);
        this.setNumConta(0);
    }
    
    public void abrirConta(String tipo, String dono, int num) {
        //verifica caso o usuario digite algo além das opções de conta permitidas
        if (tipo.equals("cc") || tipo.equals("cp")) {
            //chamam os metodos de set para adicionar um novo dado as variaveis
            this.setTipo(tipo);
            this.setStatus(true);
            this.setDono(dono);
            this.setNumConta(num);
            //uma parte de ifs que verifica qual opção escolheu para definir o saldo inicial.
            if (tipo.equals("cc")) {
                this.setSaldo(50);
            }
            else if (tipo.equals("cp")) {
                this.setSaldo(150);
            }
            //apenas para avisar que tudo ocorreu bem.
            System.out.println("Cliente cadastrado com sucesso!");
        }
        else {
            //aviso para caso o usuario tenha escolhido uma opção de conta nada a ver.
            System.out.println("Tipo de conta invalida tente novamente!");
        }
    }
    
    public void fecharConta() {
        //função nova criada para barrar alguns metodos caso o status da conta esteja falso.
        if (!verifStatus()) return;
        //como dito na atividade o usuario só pode fechar a conta caso seu saldo seja exatamente 0.
        if (saldo > 0) {
            System.out.println("Ainda possui saldo na conta, impossivel fechar a conta!");
        }
        else if (saldo < 0) {
            System.out.println("Saldo negativo, está devendo o banco, logo impossivel fechar a contas!");
        }
        else {
            /*veja que a conta não exclui os outros dados, porém como o status como false impede modificar qualquer outra coisa
            é como se os outros dados não existissem por não ter acesso a eles*/
            this.setStatus(false);
            System.out.println("Conta Fechada com sucesso!");
        }
   }
    
    public void depositar(float deposito) {
        if (!verifStatus()) return;
        //seta o saldo usando o setsaldo, com dentro dele uma conta que pega o saldo atual com o get e soma junto do deposito.
        this.setSaldo(getSaldo() + deposito);
    }
    
    public void sacar(float sacar) {
        if (!verifStatus()) return;
        //impede caso o saque seja maior que o total na conta.
        if (sacar > this.getSaldo()) {
            System.out.println("Valor pedido é superior ao total atual do saldo!");
        }
        //o usuario nao pode desejar por 0 reais ou por uma quantia negativa de dinheiro.
        else if (sacar <= 0) {
            System.out.println("Por favor insira um valor maior que 0!");
        }
        //se tudo ocorrer bem o usuario consegue retirar o dinheiro.
        else {
            System.out.println("Dinheiro sacado com sucesso");
            //funciona semelhante ao deposito mas ao inves de adicionar ao get, ele diminui.
            this.setSaldo(this.getSaldo() - sacar);
        }
    }
    
    public void pagarMensal() {
        if (!verifStatus()) return;
        //analisa o tipo de conta para saber quanto vai retirar.
        //note que aqui nao tem um verificador se o saldo tem dinheiro o bastante para pagar, logo o usuario pode se endividar.
        if (this.getTipo().equals("cc")) {
            this.setSaldo(this.getSaldo() - 12);
        }
        else if (this.getTipo().equals("cp")) {
            this.setSaldo(this.getSaldo() - 20);
        }
        System.out.println("Pagamento mensal feito com sucesso!");
    }
    
    public boolean verifStatus() {
        //metodo que verifica se o status está ativo, o if ! representaria algo como "se não estiver ativo" 
        if (!this.getStatus()) {
            System.out.println("Conta ainda não existe! impossivel usar esta funcao ainda");
            return false;
        }
        //caso o if nao ocorra, ele nao vai retornar o falso, então deve retornar verdadeiro.
        return true;
    }
    //Lista dos metodos set (que apenas atualizarão os dados das respectivas variaveis).
    public final void setNumConta(int num) {
        this.numConta = num;
    }
    public final void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public final void setDono(String dono) {
        this.dono = dono;
    }
    public final void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public final void setStatus(boolean status) {
        this.status = status;
    }

    //Lista dos metodos get (que apenas retornam os dados das respectivas variaveis).
    public int getNumConta() {
        return this.numConta;
    }
    public String getTipo() {
        return this.tipo;
    }
    public String getDono() {
        return this.dono;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public boolean getStatus() {
        return this.status;
    }
    
    //Todas as variaveis importantes declaradas aqui em baixo.
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
}
