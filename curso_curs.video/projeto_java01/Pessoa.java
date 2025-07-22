package projeto_java01;

public abstract class Pessoa {

    //#region ATRIBUTOS

    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    //#endregion

    public Pessoa(String nome, int idade, String sexo, int experiencia){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = experiencia;
    }



    //#region GETTERS

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }
    public int getExperiencia() {
        return experiencia;
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
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    //#endregion



    //#region METODOS

    public void ganharExp(){
        System.out.println("VOCÊ GANHOU +1 DE EXP");
        setExperiencia(getExperiencia()+1);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", sexo=").append(sexo);
        sb.append(", experiencia=").append(experiencia);
        sb.append('}');
        return sb.toString();
    }

    //#endregion
 
}
