package aula07;

public class Lutador {
    
    //#region ATRIBUTOS

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    //#endregion


    //#region CONSTRUTOR

    public Lutador(
        String nome,
        String nacionalidade,
        int idade, 
        float altura,
        float peso,
        int vitorias,
        int empates,
        int derrotas
        
    ){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    //#endregion

    //#region GETTERS

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    

    //#endregion

    //#region SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        String categoria;
        if(this.getPeso() < 52.2f){
            categoria = "Inválido";
        } else if(this.getPeso() <= 70.3f){
            categoria = "Leve";
        } else if(this.getPeso() > 70.3f && this.getPeso() <= 83.9f){
            categoria = "Media";
        } else if(this.getPeso() > 83.9f && this.getPeso() <= 120.2f){
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    //#endregion

    //#region METODOS

    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.nacionalidade);
        System.out.println(getIdade() + " Anos");
        System.out.println(getAltura() + "m de Altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());

    }

    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.empates + " empates");

    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);

    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);

    }

    //#endregion


}
