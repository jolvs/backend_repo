public class Caneta {
    //#region Atributes
    public String modelo;
    private float ponta;
    //#endregion

    //#region constructors


    //#endregion

    //#region getters

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    //#endregion

    //#region setters

     public void setModelo(String modelo) {
        this.modelo = modelo;
    }

      public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    //#endregion

    

    //#region metods

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta " + this.ponta);
    }

    //#endregion
}
