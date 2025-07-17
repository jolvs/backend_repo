package aula11;

public class Aula11 {
    public static void main(String[] args) {

        Visitante visitante1 = new Visitante();
        Aluno aluno1 = new Aluno();
        Bolsista bolsista1 = new Bolsista();

        aluno1.setNome("Claudio");
        aluno1.setIdade(16);
        aluno1.setSexo("Masculino");

        aluno1.setMatricula(00127475);
        aluno1.setCurso("ADS");
        System.out.println(aluno1.toString());
        aluno1.PagarMensalidade();
        

        bolsista1.setNome("jubileu");
        bolsista1.PagarMensalidade(); 

    }
}