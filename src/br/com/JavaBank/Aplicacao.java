package br.com.JavaBank;

import br.com.JavaBank.Clientes.Cliente;
import br.com.JavaBank.Clientes.ClientePF;
import br.com.JavaBank.Clientes.ClientePJ;

public class Aplicacao {
    public static void main(String[] args) {
        Conta contaBancaria = new Conta();
        Cliente pessoaFisica = new ClientePF("Kayllane", "Rua ABC" );
        Cliente pessoaJuridica = new ClientePJ("Pina", "Rua S/N");

        contaBancaria.setTitular(pessoaJuridica);
        contaBancaria.setSaldo(900);

        contaBancaria.setSaque(30);
        contaBancaria.setDeposito(255);
        contaBancaria.setInvestir(600);
        contaBancaria.setTransferir(20);

        System.out.println(contaBancaria.getSaque());
        System.out.println(contaBancaria.getDeposito());
        System.out.println(contaBancaria.getInvestir());
        System.out.println(contaBancaria.getTransferir(10, pessoaFisica));

    }
}
