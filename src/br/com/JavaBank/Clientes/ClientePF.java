package br.com.JavaBank.Clientes;

public class ClientePF extends Cliente{
    private static final String tipoDeRegistro = "cpf";

    public ClientePF(){}

    public ClientePF(String nome, String endereco) {
        super(nome, endereco);
    }

    @Override
    public String getTipoDeRegistro(){
        return tipoDeRegistro;
    }

}
