public interface Iconta {
        void Sacar (double valor);

        void Depositar(double valor);

        void Transferir (double valor, Iconta contaDestino);

        void ImprimirExtrato ();
}
