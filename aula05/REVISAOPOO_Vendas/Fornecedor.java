package AULAS.aula05.REVISAOPOO_Vendas;

public class Fornecedor extends Pessoa{
    private String cnpj;
    private String email;
    
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj (String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail (String email){
        this.email = email;
    }
}
