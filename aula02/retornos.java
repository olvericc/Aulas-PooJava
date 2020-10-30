package pooJava.aula02;

public class retornos {
    public static void main(String[] args) {
        /*Calculos cal = new Calculos();
        cal.Soma(10, 5);
        
        double valor = cal.Multiplicacao(15, 2);
        System.out.println("Multiplicacao: "+cal.Multiplicacao(15, 2));*/
        
        Pessoa Eric = new Pessoa();
        Pessoa Sophia = new Pessoa();
    
        Sophia.setCodigo(20);
        Sophia.setNome("Sophia Oliveira");
        Sophia.setIdade(15);
    
        System.out.println("Nome: "+Sophia.getNome());
        System.out.println("Código: "+Sophia.getCodigo());
        System.out.println("Idade: "+Sophia.getIdade());
        
        Eric.setCodigo(50);
        Eric.setNome("Eric");
        Eric.setIdade (18);
    
        System.out.println("Nome: "+Eric.getNome());
        System.out.println("Código: "+Eric.getCodigo());
        System.out.println("Idade: "+Eric.getIdade());
    }
}
