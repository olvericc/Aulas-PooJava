package AULAS.aula04.AtividadePOO_Vendas;

import java.util.Date;

public class Cliente {
    private Date dataDeNasc;
    private String cpf;
    
    public Date getDataDeNasc(){
        return dataDeNasc;
    }
    public void setDataDeNasc (Date dataDeNasc){
        this.dataDeNasc = dataDeNasc;
    }
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
            
}
