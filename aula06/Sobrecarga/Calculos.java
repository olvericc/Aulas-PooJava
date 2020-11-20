package AULAS.aula06.Sobrecarga;
//mesmo nome so que com parametros distintos
public class Calculos {
    public double Calculo (double x, double y){
        return x + y;
    }
    public double Calculo (double x, double y, double resp){
        resp = x * y;
        return resp;
    }
    public double Calculo (double x, double y, boolean resp){
        double calc;
        if (resp){
            calc =  x - y;
        }else{
            calc = 0;
        } 
        return calc;    
    }
}
