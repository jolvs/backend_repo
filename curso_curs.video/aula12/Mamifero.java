package aula12;

public class Mamifero extends Animal {

    //#region ATRIBUTOS

    private String corPelo;

    //#endregion  
    
    

    //#region GETTERS

    public String getCorPelo(){
        return this.corPelo;
    }

    //#endregion



    //#region SETTERS

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //#endregion

    

    //#region METODOS ABSTRATOS

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

    //#endregion
    
}
