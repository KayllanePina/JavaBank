package br.com.JavaBank.Clientes;

public class ClientePJ extends Cliente{
    private static final String tipoDeRegistro = "cnpj";

    public ClientePJ() {}

    public ClientePJ(String nome, String endereco) {
        super(nome, endereco);
    }

    @Override
    public String getTipoDeRegistro(){
        return tipoDeRegistro;
    }
}