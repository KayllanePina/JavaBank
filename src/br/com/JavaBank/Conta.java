package br.com.JavaBank;

import br.com.JavaBank.Clientes.Cliente;
import br.com.JavaBank.Clientes.ClientePJ;

public class Conta {
    protected double saldo;
    protected Cliente titular;
    protected double valor;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaque(){
        double operacao = this.saldo -= this.valor;
        double saldoAtual;
        if(titular instanceof ClientePJ){
            if(this.saldo >= this.valor){
                saldoAtual = this.saldo - (operacao * 0.05);
                return saldoAtual;
            } else {
                System.out.println("Valor inválido");
            }
        } else{
            if(this.saldo >= this.valor){
                return operacao;
            } else {
                System.out.println("Valor inválido");
            }
        }
        return 0;
    }

    public void setSaque(double valor){
        this.valor = valor;
    }

    public double getDeposito() {
        return this.saldo + this.valor;
    }

    public void setDeposito(double valor) {
        this.valor = valor;
    }

    public double getInvestir(){
        if(titular instanceof ClientePJ){
            return (this.saldo + this.valor) * 1.02;
        } else {
            return this.saldo + this.valor;
        }
    }

    public void setInvestir(double valor){
        this.valor = valor;
    }

    public void deposita(double valor){
        this.saldo = saldo + valor;
    }

    public double getTransferir(double valor, Cliente destino) {
        double operacao = this.saldo -= this.valor;
        double saldoAtual = this.saldo - operacao;
        if(titular instanceof ClientePJ){
            if(this.saldo >= this.valor){
                saldoAtual = this.saldo - (operacao * 0.05);
                destino.deposita(operacao);
                System.out.println("Transferencia concluida com sucesso.");
            } else{
                System.out.println("Valor inválido");
            }
        } else {
            if(this.saldo >= this.valor){
                saldoAtual = operacao;
                destino.deposita(this.valor);
                System.out.println("Transferencia concluida com sucesso");
            } else {
                System.out.println("Valor inválido");
            }
        }
        return saldoAtual;
    }

    public void setTransferir(double valor){
        this.valor = valor;
    }

}