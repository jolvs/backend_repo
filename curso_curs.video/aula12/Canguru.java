package aula12;

public class Canguru extends Mamifero {

    //#region METODOS

    public void usarBolsa(){
        System.err.println("Usando bolsa...");
    }

    //#endregion

    //#region METODOS ABSTRATOS

    @Override
    public void locomover(){
        System.out.println("Saltando");
    }

    //#endregion

}
