package AULAS.aula04.AtividadePOO_Vendas;

import java.util.Date;

public class Vendas {
    private int codigo;
    private int idCliente;
    private int idProduto;
    private int quantidade;
    private Date data_saida;
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo (int codigo){
        this.codigo = codigo;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    public void setIdCliente (int idCliente){
        this.idCliente = idCliente;
    }
    
    public int getIdProduto(){
        return idProduto;
    }
    public void setIdProduto (int idProduto){
        this.idProduto = idProduto;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade (int quantidade){
        this.quantidade = quantidade;
    }
    
    public Date getDataSaida(){
        return data_saida;
    }
    public void setDataSaida (Date data_saida){
        this.data_saida = data_saida;
    }
    
    
}
