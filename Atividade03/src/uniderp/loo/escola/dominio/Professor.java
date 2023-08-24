package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Professor extends BasePessoa{

    private String registro;
    private LocalDate dataContratacao;
    
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimanto, String rg,
            String cpf, LocalDate dataInsercao, String registro, LocalDate dataContratacao) {
        super(codigo, nome, endereco, telefone, dataNascimanto, rg, cpf, dataInsercao);
        this.registro = registro;
        this.dataContratacao = dataContratacao;
    }

    



}