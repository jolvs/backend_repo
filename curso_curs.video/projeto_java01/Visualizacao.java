package projeto_java01;

public class Visualizacao {

    //#region ATRIBUTOS

    private Gafanhoto espectador;
    private Video filme;

    //#endregion



    //#region CONSTRUTOR

    public Visualizacao(Gafanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.settotAssistido(this.espectador.gettotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    //#endregion



    //#region GETTERS

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public Video getFilme() {
        return filme;
    }

    //#endregion



    //#region SETTERS

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    //#endregion



    //#region METODOS

    public void avaliar(){
        this.filme.setAvaliacao(5);

    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);

    }

    public void avaliar(float porc){
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Visualizacao{");
        sb.append("espectador=").append(espectador);
        sb.append(", filme=").append(filme);
        sb.append('}');
        return sb.toString();
    }

    //#endregion
}
