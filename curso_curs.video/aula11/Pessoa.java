package aula11;

public abstract class Pessoa {

    //#region ATRIBUTOS
    
    protected String nome;
    protected int idade;
    protected String sexo;

    //#endregion



    //#region SETTERS

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
    

    //#region METODO

    public final void fazerAniv(){
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", sexo=").append(sexo);
        sb.append('}');
        return sb.toString();
    }

    //#endregion

    
}
