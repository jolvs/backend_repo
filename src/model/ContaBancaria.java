package src.model;

public class ContaBancaria {
    
    //#region ATRIBUTES
    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    //#region

    //#region CONSTRUTORES
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
    }
    //#endregion
    
    //#region GETTERS
    public String getAgencia() {
        return agencia;
    }
    
    public String getConta() {
        return conta;
    }
    public Integer getDigito() {
        return digito;
    }
    public Double getSaldo() {
        return saldo;
    }
    //#endregion
    
    //#region SETTERS
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public void setDigito(Integer digito) {
        this.digito = digito;
    }
    //#endregion



} 