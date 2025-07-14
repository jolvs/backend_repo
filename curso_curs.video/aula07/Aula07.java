package aula07;

public class Aula07 {
    public static void main(String[] args) {

        Lutador[] lutador = new Lutador[5];

        lutador[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        lutador[1] = new Lutador("PutScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutador[2] = new Lutador("DeadCode", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        lutador[3] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        lutador[4] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);

        lutador[0].apresentar();
        System.out.println();
        lutador[0].status();



    }
    
}
