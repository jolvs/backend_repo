package aula10;

public class Aula10 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Joao", 18, "Masculino");

        Aluno p2 = new Aluno("José", 20, "Masculino", 00127475, "ADS");

        Professor p3 = new Professor("Pedro", 30, "Masculino", "Profesor de Desenvolvimento de Sistemas", 3500f);

        Funcionario p4 = new Funcionario("Maria", 25, "Feminino", "RH", true);

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");  

        p2.setCurso("Informatica");
        p3.setSalario(5000f);
        p4.setSetor("Estoque");

        p1.receberAumento(550.20f);





    }
}