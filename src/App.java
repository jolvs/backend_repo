package src;

import src.model.ContaCorrente;
import src.utils.DataUtil;

public class App {

    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();

        ContaCorrente conta01 = new ContaCorrente("0001", "7542", 5, 100.00);
        System.out.println("Saldo atual de R$" + conta01.getSaldo());
        System.out.println();

        conta01.depositar(250.0);
        System.out.println("Saldo atual de R$" + conta01.getSaldo());
        System.out.println();

        var saque = conta01.sacar(150.0);
        System.out.println("Saldo atual de R$" + conta01.getSaldo());
        System.out.println();

        ContaCorrente conta02 = new ContaCorrente("0001", "7566", 3, 200.00);
        conta02.transferir(100.0, conta01);
        System.out.println("Saldo conta de destino de R$" + conta02.getSaldo());
        System.out.println();
        System.out.println("Saldo atual de R$" + conta01.getSaldo());
        System.out.println();


        System.out.println(conta02.getDataAbertura());

        var f1= DataUtil.converterDateParaDataEHora(conta02.getDataAbertura());
        var f2= DataUtil.converterDateParaData(conta02.getDataAbertura());
        var f3= DataUtil.converterDateParaHora(conta02.getDataAbertura());
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

    }
}