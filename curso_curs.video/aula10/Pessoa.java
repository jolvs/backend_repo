package aula10;

public class Pessoa {

    //#region ATRIBUTOS

    private String nome;
    private int idade;
    private String sexo;
    
    //#endregion

    

    //#region CONSTRUTOR

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //#endregion



    //#region  GETTERS

    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getSexo() {
        return sexo;
    }

    //#endregion
    


    //#region SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //#endregion



    //#region METODOS

    public void fazerAniversario(){
        this.idade++;
    }

    //#endregion

    
    
}
