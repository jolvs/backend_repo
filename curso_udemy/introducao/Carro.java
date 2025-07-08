package introducao;
public class Carro {

    //#region ATRIBUTES
    private String modelo;
    private Integer ano;
    private String cor;
    //#endregion

    //#region CONSTRUTORES

    public Carro(){};

    public Carro(String modelo, Integer ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    //#endregion

    //#region SETTERS
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    //#endregion

    //#region GETTERS
    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }
    //#endregion

}
