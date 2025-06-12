package src;

import src.model.ContaBancaria;

public class App {

    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();

        ContaBancaria conta01 = new ContaBancaria("0001", "7542", 5, 100.00);

        System.out.println(conta01.getSaldo());
    }
}