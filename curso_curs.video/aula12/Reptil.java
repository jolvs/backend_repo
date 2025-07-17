package aula12;

public class Reptil extends Animal {

    //#region ATRIBUTOS

    private String corEscama;

    //#endregion



    //#region GETTERS

    public String getCorEscama(){
        return this.corEscama;
    }

    //#endregion



    //#region SETTERS

    public void setCorEscama(String corEscama){
        this.corEscama = corEscama;
    }

    //#endregion



    //#region METODOS ABSTRATOS

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.err.println("Som de Réptil");   
    }
    
    //#endregion

   
}
