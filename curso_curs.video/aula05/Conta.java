package aula05;

public class Conta {

    //#region ATRIBUTOS
    
    private int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //#endregion

    //#region CONSTRUTORES

    public Conta(int numConta, String dono){
        this.numConta = numConta;
        this.dono = dono;
        this.status = false;
        this.saldo = 0;
    }

    //#endregion 

    //#region GETTERS

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    //#endregion

    //#region SETTERS

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //#endregion

    //#region METODOS

    public void status(){
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Titular da conta: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Conta está aberta? " + this.getStatus());
    }

    public void abrirConta(String tipo){
        if(tipo.equals("CC")){
            this.setTipo(tipo);
            this.setStatus(true);
            this.setSaldo(50.0f);
        } else if(tipo.equals("CP")){
            this.setTipo(tipo);
            this.setStatus(true);
            this.setSaldo(150.0f);
        } else {
            System.out.println("O tipo digitado está incorreto, digite novamente");
        }

    }

    public void fecharConta(){
        if(this.getSaldo() == 0){
            System.out.println("Conta fechada com sucesso!!!");
            System.out.println("A conta está zerada e não possuí nenhum debito ativo");
            this.setStatus(false);
        } else {
            System.out.println("A conta ainda possuí dinheiro ou tem algum débito pendente a ser quitado");
            this.setStatus(true);
        }
    }

    public void depositar(float valor){
        if(this.getStatus() == true) {
            float valorAtual = this.getSaldo() + valor;
            this.setSaldo(valorAtual);
        }

    }

    public void sacar(float valor) {
        if(this.getSaldo() >= valor && this.getStatus() == true && valor <= 1000f){
            float saldoAtual = this.getSaldo() - valor;
            this.setSaldo(saldoAtual);
        } else {
            System.out.println("O saque não cumpriu um dos seguintes requisitos:");
            System.out.println("- Sem saldo insuficiente");
            System.out.println("- O saque pode ter ultrapassado o limite de R$1000 reais por saque");
            System.out.println("- A conta pode estar fechada");
        }
    }

    public void pagarMensal(){

        float saldoAtual;
        int valorMensal;

        if(this.getTipo().equals("CC") && this.getStatus() == true) {
            valorMensal = 12;

            if(this.getSaldo() >= valorMensal){
                saldoAtual = this.getSaldo() - valorMensal;
                this.setSaldo(saldoAtual);
            } else {
                System.out.println("Saldo Insuficiente");
            }
            

        } else if(this.getTipo().equals("CP") && this.getStatus() == true) {
            valorMensal = 20;

            if(this.getSaldo() >= valorMensal){
                saldoAtual = this.getSaldo() - valorMensal;
                this.setSaldo(saldoAtual);
            } else {
                System.out.println("Saldo Insuficiente");
            }

        } else {
            System.out.println("Impossível de pagar");
        }

    }
    

    //#endregion

}
