package projeto_java01;


public class Video implements AcoesVideo {

    //#region ATRIBUTOS
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;


    //#endregion

    //#region CONSTRUTOR

    public Video(String titulo, int avaliacao){
        this.titulo = titulo;
        this.avaliacao = avaliacao;
        this. views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    //#region GETTERS

    public String getTitulo() {
        return titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public int getViews() {
        return views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    //#endregion




    //#region SETTERS

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //#endregion

    

    //#region METODOS INTERFACE

    @Override
    public void play() {
        if(getReproduzindo() == false){
            System.out.println("|> REPRODUZINDO");
            setReproduzindo(true);
        } else {
            System.out.println("ALERTA: O vídeo já está rodando");

        }
    }


    @Override
    public void pause() {
        if(getReproduzindo() == true){
            System.out.println("|| PAUSADO");
            setReproduzindo(false);
        } else {
            System.out.println("ALERTA: O vídeo já está pausado");
        }
    }

    @Override
    public void like() {
        System.out.println("CURTIDA ADICIONADA, VIDEO MARCADO COMO 'GOSTEI'");
        setCurtidas(getCurtidas()+1);
    }

    

    //#endregion



    //#region METODOS OVERRIDE

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Video{");
        sb.append("titulo=").append(titulo);
        sb.append(", avaliacao=").append(avaliacao);
        sb.append(", views=").append(views);
        sb.append(", curtidas=").append(curtidas);
        sb.append(", reproduzindo=").append(reproduzindo);
        sb.append('}');
        return sb.toString();
    }

    //#endregion

    
    
}