package aula12;

public class Peixe extends Animal {

    //#region ATRIBUTOS

    private String corEscama;

    //#endregion



    //#region GETTERS

    public String getCorEscama(){
        return this.corEscama;
    }

    //#endregion



    //#region SETTERS

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    //#endregion



    //#region METODOS

    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    //#endregion



    //#region METODOS ABSTRATOS

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    //#endregion
    
    
}
