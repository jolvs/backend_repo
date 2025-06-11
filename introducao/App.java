package introducao;
public class App {

    public static void main(String[] args) {
        System.out.println("Aprendendo POO com Java");

        //Instaciando uma classe, construindo um objeto.
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Fulano");
        pessoa1.setIdade(21);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());


        Pessoa pessoa2 = new Pessoa();
        pessoa1.setNome("Ciclano");
        pessoa1.setIdade(25);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        
        Carro meuCarro = new Carro();
        meuCarro.setAno(2025);
        meuCarro.setCor("Preto");
        meuCarro.setModelo("Jeep Renegate");

        System.out.println(meuCarro.getAno());
        System.out.println(meuCarro.getCor());
        System.out.println(meuCarro.getModelo());


        Carro novoCarro = new Carro("Fiat Toro", 2024, "Vermelho");

        System.out.println(novoCarro.getModelo());
        System.out.println(novoCarro.getAno());
        System.out.println(novoCarro.getCor());
    }
}