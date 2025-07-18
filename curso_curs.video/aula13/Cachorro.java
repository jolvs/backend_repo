package aula13;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Som de Cachorro: Au Au Au");
    }

    public void reagir(String frase){
        if(frase.contains("toma comida") || frase.contains("olá")){
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if(hora < 12){
            System.out.println("Abanar");
        } else if(hora >= 18){
            System.err.println("Igonorar");
        } else {
            System.out.println("Ignorar");
        }
    }

    public void reagir(boolean dono) {
        if(dono == true){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade, float peso){
        if(idade < 5){
            if(peso < 10){
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if(peso < 10){
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }

    }
    
}
