package Funcionalidades;

import br.com.JavaBank.Conta;

public class Depositar extends Conta {
    public double getDeposito(){
        return super.getDeposito() + super.valor;
    }
}
