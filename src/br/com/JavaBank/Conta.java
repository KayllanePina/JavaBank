package br.com.JavaBank;

import br.com.JavaBank.Clientes.Cliente;

public class Conta {
    protected double saldo;
    protected Cliente titular;


    public Conta() {
    }

    public Conta(double saldo, Cliente titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

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

    //Sacar
    public boolean saque(double valor) {
        if (titular.getTipoDeRegistro() == "cnpj") {
            if (this.saldo >= valor) {
                double taxa = 0.05;
                double operacao = (this.saldo -= valor) * taxa;
                double saldoAtual = this.saldo - operacao;
                System.out.println("O saldo atual da sua conta é " + saldoAtual);
                return true;
            } else {
                System.out.println("Valor inválido");
                return false;
            }

        } else {
            if (this.saldo >= valor) {
                double operacao = (this.saldo -= valor);
                System.out.println("O saldo atual da sua conta é " + operacao);
                return true;
            } else {
                System.out.println("Valor inválido");
                return false;
            }
        }
    }

    //Funcionalidades
    /*
     * Depositar
     * Transferir
     * Investir*/
}
