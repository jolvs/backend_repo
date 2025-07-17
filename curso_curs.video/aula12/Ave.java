package aula12;

public class Ave extends Animal {

    //#region ATRIBUTOS

    private String corPena;

    //#endregion



    //#region GETTERS

    public String getCorPena() {
        return corPena;
    }

    //#endregion

    

    //#region SETTERS

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    //#endregion

    //#region METODOS ABSTRATOS

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Construiu um ninho");
    }

    //#endregion
    
}
