package src.model;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {
    
    //#region ATRIBUTES
    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    private Double VALOR_MINIMO_DEPOSITO = 10.0;
    private Date dataAbertura;
    //#region

    //#region CONSTRUTORES
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
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

    public Date getDataAbertura() {
        return dataAbertura;
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

    //#region METODOS

    public void depositar(Double valor){
        //this.saldo = this.saldo + valor;

        //verifica se o valor é maior que o valor minimo de depósito
        //se for menor, mostra uma mensagem de erro
        if(valor < VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("O valor minimo de depósito é R$" + VALOR_MINIMO_DEPOSITO);
        }
        this.saldo += valor;
    }

    public Double sacar(Double valor) {
        //this.saldo = this.saldo - valor;

        //Verifica se o valor é maior que o saldo da conta.
        //Se for manda mensagem de saldo insuficiente
        if(valor > this.saldo){
            throw new InputMismatchException("O saldo é insuficiente");
        }

        this.saldo -= valor;
        return valor;
    }

    public void transferir(Double valor, ContaBancaria contaDestino){

        //Efetua um saque na conta atual
        this.sacar(valor);

        //Efetua o depósito na conta de destino
        contaDestino.depositar(valor);
    }

    //#endregion


} 