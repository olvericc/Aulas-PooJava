package pooJava.aula01;

public class ação {
    public static void main(String[] args) {                                    
        Banco brasil = new Banco(); //gerando um objeto brasil
        
        Banco santander = new Banco();    //gerando um objeto brasil1
        
        Banco bradesco =  new Banco();   //gerando um objeto bradesco
        
        Banco caixa = new Banco();    //gerando um objeto caixa
        
        brasil.saldo = 150;
        brasil.Depositar(800); //ação de adicionar
        System.out.println("Saldo Brasil: "+brasil.saldo);
        brasil.Sacar(3000); //ação de subtrair
        System.out.println("Saldo Brasil: "+brasil.saldo);
        brasil.Sacar(500);  //ação de subtrair
        System.out.println("Saldo Brasil: "+brasil.saldo);
        brasil.Depositar(10);   //ação de adicionar
        System.out.println("Saldo Brasil: "+brasil.saldo);
        
        caixa.saldo = 110;
        caixa.Depositar(700); //ação de adicionar
        System.out.println("Saldo Caixa: "+caixa.saldo);
        caixa.Sacar(350); //ação de subtrair
        System.out.println("Saldo Caixa: "+caixa.saldo);
        caixa.Sacar(700);  //ação de subtrair
        System.out.println("Saldo Caixa: "+caixa.saldo);
        caixa.Depositar(40);   //ação de adicionar
        System.out.println("Saldo Caixa: "+caixa.saldo);
    }
}
