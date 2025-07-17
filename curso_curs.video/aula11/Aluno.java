package aula11;

public class Aluno extends Pessoa {

    //#region ATRIBUTOS
    private int matricula;
    private String curso;
    //#endregion

    //#region METODOS

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

    public void PagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno: " + this.getNome());
    
    }

    //#endregion

}
