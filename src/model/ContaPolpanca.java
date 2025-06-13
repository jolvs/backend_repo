package src.model;

public class ContaPolpanca extends ContaBancaria {

    public ContaPolpanca(String agencia, String conta, Integer digito, Double saldoInicial) {

        //Aqui por baixo ele cria uma conta bancaria.
        super(agencia, conta, digito, saldoInicial);
    }
    
}
