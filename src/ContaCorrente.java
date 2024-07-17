public class ContaCorrente extends Conta {
    
    //construtor
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("***Extrato Conta Corrente***");
        super.imprimirInfoComuns();
    }



   
} 
