package projetopoo;

import java.sql.Date;

public class OrdemServiço {
    private int numero;
    private String descricaoproblema, descricaoservico, motivocancelamento;
    private Date datacadastro, datacancelamento, datasolucao;
    
    Funcionario Funcionario;
    Cliente Cliente;
    ClassificaçaoProblema ClassificaçaoProblema;
        
    OrdemServiço(){
        Funcionario = new Funcionario();
        Cliente = new Cliente();
        ClassificaçaoProblema =  new ClassificaçaoProblema();
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricaoproblema() {
        return descricaoproblema;
    }

    public void setDescricaoproblema(String descricaoproblema) {
        this.descricaoproblema = descricaoproblema;
    }

    public String getDescricaoservico() {
        return descricaoservico;
    }

    public void setDescricaoservico(String descricaoservico) {
        this.descricaoservico = descricaoservico;
    }

    public String getMotivocancelamento() {
        return motivocancelamento;
    }

    public void setMotivocancelamento(String motivocancelamento) {
        this.motivocancelamento = motivocancelamento;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public Date getDatacancelamento() {
        return datacancelamento;
    }

    public void setDatacancelamento(Date datacancelamento) {
        this.datacancelamento = datacancelamento;
    }

    public Date getDatasolucao() {
        return datasolucao;
    }

    public void setDatasolucao(Date datasolucao) {
        this.datasolucao = datasolucao;
    }

    public Funcionario getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(Funcionario Funcionario) {
        this.Funcionario = Funcionario;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public ClassificaçaoProblema getClassificaçaoProblema() {
        return ClassificaçaoProblema;
    }

    public void setClassificaçaoProblema(ClassificaçaoProblema ClassificaçaoProblema) {
        this.ClassificaçaoProblema = ClassificaçaoProblema;
    }
    
    
}
