public class Caneta {
    //#region Atributes
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    //#endregion


    //#region constructes

    public Caneta(String modelo, float ponta, String cor) {
        this.setModelo(modelo);
        this.setPonta(ponta);
        this.cor = cor;
        this.tampar();
    }

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
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampada(){
        this.tampada = false;
    }

    //#endregion
}
