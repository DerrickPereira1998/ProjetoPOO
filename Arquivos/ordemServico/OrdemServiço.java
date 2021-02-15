package projetopoo.ordemServico;

import projetopoo.classificacaoProblema.ClassificaçaoProblema;
import projetopoo.funcionario.Funcionario;
import projetopoo.cliente.Cliente;
import java.sql.Date;

public class OrdemServiço {
    private int numero;
    private String descricaoproblema, descricaoservico, motivocancelamento;
    private Date datacadastro, datacancelamento, datasolucao;
    
    Funcionario funcionario;
    Cliente cliente;
    ClassificaçaoProblema classificaçaoProblema;
        
    public OrdemServiço(){
        this.funcionario = new Funcionario();
        this.cliente = new Cliente();
        this.classificaçaoProblema =  new ClassificaçaoProblema();
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
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente_() {
        return cliente;
    }

    public void setCliente_(Cliente Cliente_) {
        this.cliente = Cliente_;
    }

    public ClassificaçaoProblema getClassificaçaoProblema() {
        return classificaçaoProblema;
    }

    public void setClassificaçaoProblema(ClassificaçaoProblema ClassificaçaoProblema) {
        this.classificaçaoProblema = ClassificaçaoProblema;
    }
    
    
}
