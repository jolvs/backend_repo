package introducao;
public class Pessoa {
    //#region ATRIBUTES
    private String nome;
    private Integer idade;
    //#endregion

    //#region SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }

     public void setIdade (Integer idade) {
        this.idade = idade;
    }
    //#endregion

    //#region GETTERS
    public String getNome(){
        return this.nome;
    }

    public Integer getIdade() {
        return this.idade;
    }
    //#endregion

}

/**
 * METODOS ACESSORES:
 * 
 * PUBLIC: Indica que qualquer um pode acessar o elemento.
 * PRIVATE: Indica que apenas a classe consegue acessar.
 * PROTECTED: Somente a classe e os seus filhos conseguem acessar. 
 * DEFAULT: Indica que somente a classe, seus filhos e as classes no mesmo package, podem acessar.
 */
