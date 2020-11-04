package POOJAVA.aula03;

public class Principal {
    public static void main(String[] args) {
        
        Pessoa pe = new Pessoa();
        
        pe.setCodigo(2);
        pe.setCpf("5385648397");
        pe.setNome("Rodrigo");
        pe.setTelefone("7194843985");
        
        System.out.println("nome: " + pe.getNome() + " cpf: " + pe.getCpf());
        
        Gerente Paulo =  new Gerente();
        
        Paulo.setCnpj("485743985");
        Paulo.setSalario(5000);
        
        System.out.println("cnpj: " + Paulo.getCnpj() + " salário: " + Paulo.getSalario());
        
        Funcionario Jose = new Funcionario();
        
        Jose.setCodigo(3);
        Jose.setSalario(1200);
        
        System.out.println("codigo: " + Jose.getCodigo() + " salário: " + Jose.getSalario());
    } 
}
