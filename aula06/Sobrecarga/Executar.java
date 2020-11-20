package AULAS.aula06.Sobrecarga;

public class Executar {
    public static void main(String[] args) {
        Calculos c = new Calculos();
        
        System.out.println("Calculo Soma: "+c.Calculo(15,2));
        System.out.println("Calculo Multiplicação: "+c.Calculo(15, 2, 0));
        System.out.println("Calculo Subtração: "+c.Calculo(15, 2, true));
                
    }
}
