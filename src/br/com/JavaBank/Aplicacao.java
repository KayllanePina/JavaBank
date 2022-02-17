package br.com.JavaBank;

import br.com.JavaBank.Clientes.Cliente;
import br.com.JavaBank.Clientes.ClientePF;
import br.com.JavaBank.Clientes.ClientePJ;

public class Aplicacao {
    public static void main(String[] args) {
        Conta contaBancaria = new Conta();
        Cliente pessoaFisica = new ClientePF();
        Cliente pessoaJuridica = new ClientePJ();

        contaBancaria.setTitular(pessoaJuridica);
        System.out.println(contaBancaria.getTitular().getTipoDeRegistro());
    }
}
