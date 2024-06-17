//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Tarcisio");

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        corrente.Depositar(150.79);
        corrente.ImprimirExtrato();

        corrente.Transferir(100, poupanca);
        poupanca.ImprimirExtrato();
        corrente.ImprimirExtrato();
    }
}