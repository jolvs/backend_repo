package aula10;

public class Aluno extends Pessoa {

    ////#region ATRIBUTOS
    
    private int matricula;
    private String curso;
    
    //#endregion

    //#region CONSTRUTOR

    public Aluno(String nome, int idade, String sexo, int matricula, String curso){
        //Classe herdada Pessoa
        super(nome, idade, sexo);
        //
        this.matricula = matricula;
        this.curso = curso;
    }

    //#endregion



    //#region GETTERS

    public int getMatricula() {
        return matricula;
    }
    
    public String getCurso() {
        return curso;
    }

    //#endregion



    //#region SETTERS

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //#endregion



    //#region METODOS

    public void cancelarMatricula(){
        System.out.println("Matricula será cancelada");

    }

    //#endregion
    

}
