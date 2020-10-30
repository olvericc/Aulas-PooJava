package pooJava.aula02.atv;

public class Executora {
    public static void main(String[] args) {
        
        Produtos Refrigerante = new Produtos();
        Produtos Pizza =  new Produtos();
        
            Refrigerante.setCodigo(45958);
            Refrigerante.setDescricao("Coca");
            Refrigerante.setQuantidade(4);
            Refrigerante.setValor(5.00);
        
        System.out.println("Descrição: "+Refrigerante.getDescricao());
        System.out.println("Código: "+Refrigerante.getCodigo());
        System.out.println("Quantidade: "+Refrigerante.getQuantidade());
        System.out.println("Valor: R$ "+Refrigerante.getValor());
        System.out.println("\n");
        
            Pizza.setCodigo(59045);
            Pizza.setDescricao("Calabresa");
            Pizza.setQuantidade(7);
            Pizza.setValor(30.00);
        
        System.out.println("Descrição: "+Pizza.getDescricao());
        System.out.println("Código: "+Pizza.getCodigo());
        System.out.println("Quantidade: "+Pizza.getQuantidade());
        System.out.println("Valor: R$ "+Pizza.getValor());
        System.out.println("\n");
    }
}
