package br.com.JavaBank.Clientes;

public abstract class Cliente {
    private String nome;
    private String endereco;

    public abstract String getTipoDeRegistro();

    public Cliente(){

    }

    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void deposita(double operacao) {
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}