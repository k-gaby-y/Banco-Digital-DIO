public class ContaPoupanca extends Conta {
     //construtor
     public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("***Extrato Conta Poupanca***");
        super.imprimirInfoComuns();
    }

    
}
