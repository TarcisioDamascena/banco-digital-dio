import java.util.ArrayList;
import java.util.List;

public class Banco {
    //Atributos
    private String nome;
    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public  void listarClientes(){
        System.out.println("Clientes: ");
        for (Conta conta: contas){
            System.out.println(conta.cliente.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
