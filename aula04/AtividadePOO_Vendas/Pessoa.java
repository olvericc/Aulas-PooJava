package AULAS.aula04.AtividadePOO_Vendas;

public class Pessoa {
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo (int codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco (String endereco){
        this.endereco = endereco;
    }
    
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone (String telefone){
        this.telefone = telefone;
    }
}
