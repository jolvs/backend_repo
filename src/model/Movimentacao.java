package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class Movimentacao {

    //#region ATRIBUTES
    private String descricao;
    private Date data;
    private Double valor;
    //#endregion

    //#region CONSTRUTORES

    public Movimentacao(String descricao, Double valor){
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;
    }

   

    //#endregion

    //#region GETTERS
    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    //#endregion

    //#region SETTERS
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    //#endregion

    //#region METODOS

    @Override
    public String toString(){
        //Descrição -
        //Data e Hora - valor

        String dataFormatada = DataUtil.converterDateParaDataEHora(this.getData());
        return this.getDescricao() + "\n" + dataFormatada + " - R$" + this.getValor(); 
    }

    //#endregion

}
