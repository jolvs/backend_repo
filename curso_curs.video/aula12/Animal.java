package aula12;

public abstract class Animal {

    //#region ATRIBUTO

    protected float peso;
    protected int idade;
    protected int membros;

    //#endregion



    //#region GETTERS

    public float getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public int getMembros() {
        return membros;
    }

    //#endregion

    

    //#region SETTERS

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    //#endregion


    
    //#region METODOS

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    //#endregion


    
}