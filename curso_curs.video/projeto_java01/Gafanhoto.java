package projeto_java01;

public class Gafanhoto extends Pessoa {

    //#region ATRIBUTOS

    private String login;
    private int totAssistido;

    //#endregion



    //#region CONSTRUTORES

    public Gafanhoto(String nome, int idade, String sexo, int experiencia, String login){
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = 0;
    }

    //#endregion



    //#region GETTERS

    public String getLogin() {
        return login;
    }

    public int gettotAssistido() {
        return totAssistido;
    }

    //#endregion



    //#region SETTERS

    public void setLogin(String login) {
        this.login = login;
    }

    public void settotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    //#endregion



    //#region METODOS
    
    public void viuMaisUm(){
        System.out.println("Mais uma view contada");
        settotAssistido(gettotAssistido()+1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //chamando o toString() da classe Pessoa
        sb.append("Gafanhoto{" + super.toString());
        sb.append("login=").append(login);
        sb.append(", totAssistido=").append(totAssistido);
        sb.append('}');
        return sb.toString();
    }

    

}
