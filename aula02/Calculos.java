package pooJava.aula02;

public class Calculos {
    private double calculo;
    public void Soma(double x, double y){
        calculo = x + y;
        System.out.println("Resultado: "+calculo);
    }
    
    public double Multiplicacao(double x, double y){
        return x * y;
    }
}
