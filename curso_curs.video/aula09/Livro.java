package aula09;

public class Livro implements Publicacao {

    //#region ATRIBUTOS

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //#endregion



    //#region CONSTRUTOR

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    //#endregion

    

    //#region GETTERS

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    //#endregion



    //#region SETTERS

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //#endregion



    //#region METODOS

    public void detalhes() {
        System.out.println("Livro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de Páginas: " + this.totPaginas);
        System.out.println("Página Atual: " + this.pagAtual);
        System.out.println("Leitor: " + this.leitor.getNome());
        System.out.println("Idade do leitor: " + this.leitor.getIdade());
        System.out.println("Sexo do leitor: " + this.leitor.getSexo());
    }

    //#endregion



    //#region METODOS INTERFACE

    @Override
    public void abrir(){
        this.aberto = true;

    }

    @Override
    public void fechar(){
        this.aberto = false;

    }

    @Override
    public void folhear(int pagina){
        if(pagina > this.totPaginas ){
            System.out.println("Valor inválido, a página é maior que o número de páginas totais do livro");
            System.out.println("\n");
        } else {
            this.pagAtual = pagina;
        }
        

    }

    @Override
    public void avancarPag(){
        this.pagAtual++;

    }

    @Override
    public void voltarPag(){
        this.pagAtual--;

    }

    //#endregion
    
}
