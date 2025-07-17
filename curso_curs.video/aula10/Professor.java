package aula10;

public class Professor extends Pessoa{

    //#region ATRIBUTES

    private String especialidade;
    private float salario;

    //#endregion


    
    //#region CONSTRUTOR
    
    public Professor(String nome, int idade, String sexo, String especialidade, float salario){
        //Classe herdada Pessoa
        super(nome, idade, sexo);
        //
        this.especialidade = especialidade;
        this.salario = salario;
    }

    //#endregion


    //#region GETTERS

    public String getEspecialidade() {
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }

    //#endregion



    //#region SETTERS

    public void setSalario(float salario) {
        this.salario = salario;
    }

     public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    //#endregion



    //#region METODOS

    public void receberAumento(float aumento){
        System.out.println("Salário Anterior: R$" + this.getSalario());
        System.out.println("Aumento dado: R$" + aumento);
        this.salario += aumento;
        System.out.println("Salário Atual: R$" + this.getSalario());

    }

    //#endregion
    
}
