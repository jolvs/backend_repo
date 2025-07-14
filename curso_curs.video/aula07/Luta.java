package aula07

import java.util.Random;

public class Luta{

    //#region ATRIBUTOS
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //#endregion



    //#region CONSTRUTORES

    //#endregion

    

    //#region GETTERS

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    //#endregion



    //#region SETTERS

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    //#endregion



    //#region METODOS

    public void marcarLuta(Lutador desafiado, Lutador desafiante){
        if(desafiado.getCategoria() == desafiante.getCategoria() && desafiado != desafiante){
            this.aprovada = true;
            setDesafiado(desafiado);
            setDesafiante(desafiante);
        } else {
            this.aprovada = false;
            setDesafiado(null);
            setDesafiante(null);
        }

    }

    public void lutar(){
        int vencedor = (int)(Math.random() * 3);
        if(aprovada == true){
            this.desafiado.apresentar();
            System.out.println("\n");
            this.desafiante.apresentar();
            System.out.println("\n");

            switch (vencedor) {

                case 0: //Empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Ganhou o Desafiado
                    System.out.println("Ganhou: " + this.desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2: //Ganhou o Desafiante
                    System.out.println("Ganhou: " + this.desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta(); //Ganhou o Desafiante
                    break;
                default:
                    throw new AssertionError();
            }

        } else {
            System.out.println("Luta não pode acontecer");
        }
        
    }

    //#endregion
}