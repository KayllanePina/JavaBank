public class Main {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Kay");

        Conta corrente = new ContaCorrente(novoCliente);
        Conta poupanca = new ContaPoupanca(novoCliente);

        corrente.depositar(200);
        corrente.transferir(30, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        // TODO: Implementar a regra de negócio pedida do exercicio
    }
}
