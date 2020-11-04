package POOJAVA.aula03;


public class Gerente extends Pessoa { //herança (extend)
    private double salario;
    private String cnpj;
    
    public double getSalario(){
        return salario;
    }
    public void setSalario (double salario){
        this.salario = salario;
    }
    
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj (String cnpj){
        this.cnpj = cnpj;   
    }
}
