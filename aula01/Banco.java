package pooJava.aula01;

public class Banco {
    public int codigo;
    public int conta;
    public int agencia;
    public String tipo;
    public double saldo;
    
    public double Depositar (double valor){
        this.saldo += valor;
        return this.saldo;
    }
    public double Sacar (double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
        }
        return saldo;
    }
}   
    
    