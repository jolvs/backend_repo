package aula13;

public class Aula13 {
    public static void main(String[] args) {

        Cachorro c = new Cachorro();

        c.emitirSom();
        c.reagir("toma comida");
        c.reagir("olá");
        c.reagir("Vai apanhar!!!");
        System.out.println("\n");

        c.reagir(11, 45);
        c.reagir(19, 00);
        System.out.println("\n");

        c.reagir(true);
        c.reagir(false);
        System.out.println("\n");

        c.reagir(2, 12.0f);
        c.reagir(17, 2.0f);
        System.out.println("\n");


        
    }

    
}
