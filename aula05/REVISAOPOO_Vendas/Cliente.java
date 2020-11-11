package AULAS.aula05.REVISAOPOO_Vendas;

import java.util.Date;

public class Cliente {  
    private String cpf;
    private Date dataDeNasc;
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
    
    public Date getDataDeNasc(){
        return dataDeNasc;
    }
    public void setDataDeNasc (Date dataDeNasc){
        this.dataDeNasc = dataDeNasc;
    }
}
