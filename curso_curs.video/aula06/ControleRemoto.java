package aula06;

public class ControleRemoto implements Controlador {

    //#region ATRIBUTOS

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //#endregion

    //#region CONSTRUTOR

    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    //#endregion

    //#region GETTERS

    private int getVolume(){
        return this.volume;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private boolean getTocando(){
        return this.tocando;
    }

    //#endregion

    //#region SETTERS

    private void setVolume(int volume){
        this.volume = volume;
    }

    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    //#endregion

    //#region METODOS



    //#endregion

    //#region IMPLEMENTS CONTROLADOR

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+= 10){
            System.out.print("|");
        }
        System.out.println("\n");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu....");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true){
            this.setVolume(getVolume() + 10);
        } else {
            System.out.println("Impossível aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true){
            this.setVolume(getVolume() - 10);
        } else {
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligartMudo() {
        if(getLigado() == true && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(getLigado() == true && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(getLigado() == true && !(this.getTocando() == true)) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() == true && this.getTocando() == true) {
            this.setTocando(false);
        }
    }

    //#endregion

}
