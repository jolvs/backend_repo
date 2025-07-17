package aula10;

public class Funcionario extends Pessoa {

    //#region ATRIBUTOS

    private String setor;
    private boolean trabalhando;

    //#endregion


    //#region CONSTRUTOR

    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando){
        //Classe herdada Pessoa
        super(nome, idade, sexo);
        //
        this.setor = setor;
        this.trabalhando = trabalhando;

    }

    //#endregion



    //#region GETTERS

    public String getSetor() {
        return setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    //#endregion



    //#region SETTERS

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    //#endregion



    //#region METODOS

    public void mudarTrabalho(float aumento){
        this.trabalhando = !this.trabalhando;
    }

    //#endregion



    
}