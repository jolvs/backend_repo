package aula05;

public class aula05 {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("----- BANCO PANPANNAMERICANO -----");
        System.out.println("CONTA CORRENTE - CC ++++++ CONTA POLPANÇA - CP");
        System.out.println("\n");

        
       Conta conta01 = new Conta(12311,"JOAO VINICIUS");
       conta01.status();
       
       conta01.abrirConta("CC");

       conta01.status();

       conta01.depositar(1000f);

       conta01.status();

       conta01.sacar(500f);
       
       System.out.println("\n");
       conta01.status();

       
       System.out.println("\n");

       conta01.pagarMensal();



       conta01.status();

       System.out.println("\n");
       conta01.fecharConta();
       System.out.println("\n");

       conta01.sacar(538f);
       conta01.status();
       System.out.println("\n");
       
       System.out.println("\n");
       conta01.fecharConta();
       System.out.println("\n");

       

        
    }
}
