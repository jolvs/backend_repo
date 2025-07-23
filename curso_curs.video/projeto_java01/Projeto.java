package projeto_java01;

public class Projeto {
    public static void main(String[] args) {

        Video v[] = new Video[3];

        v[0] = new Video("Aula 12 PHP", 5);
        v[1] = new Video("Aula 1 de POO ", 4);
        v[2] = new Video("Aula 10 de HTML5", 5);

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", 10, "jubis");
        g[1] = new Gafanhoto("Creuza", 12, "F", 10, "creuzete");

        System.out.println(g[0].toString());
        System.out.println("\n");
        System.out.println(g[1].toString());

        Visualizacao visualizacao1 = new Visualizacao(g[0], v[2]);

        System.out.println(visualizacao1.toString());
        
    }
}