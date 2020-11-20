package AULAS.aula06.Construtores;

public class Construtores {
    private int senha;
    private String login;
    private double valor1;
    private double valor2;
    
    public double Calculo(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
        return this.valor1 + this.valor2;         
    }
    
    public Construtores(String login){
        senha = 1234;
        this.login = login;
    }
    
    public Construtores(){}
    
    public int getSenha() {
        return senha;
    }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
}
