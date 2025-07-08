public class Aula04 {
    public static void main(String[] args) {

        Caneta c1 = new Caneta("BIC", 0.5f, "Vermelha");
        c1.status();

        Caneta c2 = new Caneta("Faber", 0.4f, "Azul");
        System.out.println("\n");
        c2.status();
    }
}
