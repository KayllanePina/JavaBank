package Funcionalidades;

import br.com.JavaBank.Conta;

public class Sacar extends Conta {
    public double getSaque(){
        return super.getSaque() - super.saldo;
    }
}
