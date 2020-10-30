package pooJava.aula02;

public class Pessoa{
    private int codigo;
    private String nome;
    private int idade;
    
    public int getCodigo(){ //Propriedade get
        return codigo;
    }
    public void setCodigo(int codigo){  //Propriedade set
        this.codigo = codigo;
    }
    public String getNome(){    
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
