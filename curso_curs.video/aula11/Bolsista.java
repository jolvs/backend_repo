package aula11;

public class Bolsista extends Aluno {

    //#region ATRIBUTOS

    private int bolsa;

    //#endregion


    
    //#region GETTERS

    public int getBolsa() {
        return bolsa;
    }

    //#endregion



    //#region SETTERS

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    //#endregion

    
    
    //#region METODOS

    public void RenovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void PagarMensalidade(){
        System.out.println(this.nome + " é bolsista, nós pagamos sua mensalidade");
    }

    //#endregion
    
}
