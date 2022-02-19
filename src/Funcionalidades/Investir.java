package Funcionalidades;

import br.com.JavaBank.Conta;

public class Investir extends Conta {
    public double getInvestir(){
        return super.getInvestir() + super.valor;
    }
}
