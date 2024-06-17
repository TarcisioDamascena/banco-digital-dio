//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente = new Cliente();
        cliente.setNome("Tarcisio");
        Cliente cliente2 = new Cliente();
        cliente.setNome("Savio");

        Conta conta1 = new ContaCorrente(cliente);
        Conta conta2 = new ContaPoupanca(cliente2);

//        corrente.Depositar(150.79);
//        corrente.ImprimirExtrato();
//        corrente.Transferir(100, poupanca);
//        poupanca.ImprimirExtrato();
//        corrente.ImprimirExtrato();

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        banco.listarClientes();


    }
}