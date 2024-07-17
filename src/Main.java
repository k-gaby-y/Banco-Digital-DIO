public class Main {
    public static void main(String[] args) {
        Cliente gaby =  new Cliente();
        gaby.setNome("Teste Gabriely");

        Conta cc = new ContaCorrente(gaby);
        cc.depositar(100);
        cc.imprimirExtrato();

        Conta poupanca = new ContaPoupanca(gaby);
        poupanca.imprimirExtrato();
        cc.transferir(50, poupanca);
        poupanca.imprimirExtrato();

    }

   

  
}
