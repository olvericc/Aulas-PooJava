package AULAS.aula05.AtividadePOO_Escola;

import java.util.Date;

public class Aluno extends Matricula{
    private String ra;
    private Date data_nasc;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }
}
