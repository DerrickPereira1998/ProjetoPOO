package projetopoo;

import java.util.ArrayList;

public class NegocioFuncionario implements InterfaceFuncionario{

    @Override
    public void cadastrar(Funcionario a) throws Exception {
        if (a == null) {
            throw new Exception("Informar os dados do funcionario");
        }
        if (a.getNome() == null){
        throw new UnsupportedOperationException("Informar nome do funcionario"); 
        }
        if (a.getNome().trim().equals("") == true) {
        throw new Exception("Informar o nome do funcionario");       
        }
        if (a.getNome().trim().length() > 100) {
            throw new Exception("O nome do aluno deverá ter no máximo 100 caracteres");
        }      
        if (a.getMatricula() < 0) {
            throw new Exception("A matricula do funcionario devera ser superior a 0");
        }        
        if (a.getCpf() == null) {
            throw new Exception("Informar o CPF");
        }
        if (a.getRg().length() != 7) {
            throw new Exception("O tamanho do rg devera ser de 7 caracteres");
        }
        if (a.getRg() == null) {
            throw new Exception("Informar o rg");
        }
        if (a.getSalario() == 0) {
            throw new Exception("Informar o Salario");
        }
        if (a.getSalario() <= 0) {
            throw new Exception("O Salario do funcionario devera ser superior a 0");
        }           
         //enviar o objeto para os dados
        DadosFuncionario dados = new DadosFuncionario();
        dados.cadastrar(a);
    }

    @Override
    public void deletar(Funcionario a) throws Exception {
        if (a == null) {
            throw new Exception("Informar os dados do funcionario");
        }
        if (a.getMatricula() <= 0) {
            throw new Exception("A matricula do funcionario deverá ser superior a zero");
        }
        //enviar o objeto para os dados
        DadosFuncionario dados = new DadosFuncionario();
        dados.deletar(a);
        
    }

    @Override
    public void editar(Funcionario a) throws Exception {
        DadosFuncionario dados = new DadosFuncionario();
        dados.editar(a);
    }

    @Override
    public ArrayList<Funcionario> listar(Funcionario filtro) throws Exception {
       DadosFuncionario dados = new DadosFuncionario();
       return dados.listar(filtro);
    }
}
