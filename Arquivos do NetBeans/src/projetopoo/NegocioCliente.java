package projetopoo;

import java.util.ArrayList;

public class NegocioCliente implements InterfaceCliente {

    @Override
    public void cadastrar(Cliente a) throws Exception {
        if (a == null) {
            throw new Exception("Informar os dados do cliente");
        }
        if (a.getCpf().length() != 11) {
            throw new Exception("O tamanho do cpf deverá ser 11 caracteres");
        }
        if (a.getCpf() == null) {
            throw new Exception("Informar o CPF");
        }
        if (a.getRg() == null) {
            throw new Exception("Informar o rg");
        }
        if (a.getRg().length() != 7) {
            throw new Exception("O tamanho do rg deverá ser de 7 caracteres");
        }
        if (a.getNome() == null) {
            throw new Exception("Informar o nome do aluno");
        }
        if (a.getNome().trim().equals("") == true) {
            throw new Exception("Informar o nome do aluno");
        }
        if (a.getNome().trim().length() > 100) {
            throw new Exception("O nome do aluno deverá ter no máximo 100 caracteres");
        }            
        DadosCliente dados = new DadosCliente();
        dados.cadastrar(a);
    }

    @Override
    public void deletar(Cliente a) throws Exception {
        if (a == null) {
            throw new Exception("Informar os dados do aluno");
        }
        if (a.getCpf().length() != 11) {
            throw new Exception("O tamanho do cpf devera ser 11");
        }
        if (a.getCpf() == null) {
           throw new Exception("Informar o CPF");
        }
        DadosCliente dados = new DadosCliente();
        dados.deletar(a);
       
    }

    @Override
    public void editar(Cliente a) throws Exception {
        if ((a.getNome()== "") || (a.getRg() == null) || (a.getCpf() == null)) {
            throw new Exception("Informar os dados do aluno para edição");
        }
        DadosCliente dados = new DadosCliente();
        dados.editar(a);
    }

    @Override
    public ArrayList<Cliente> listar(Cliente filtro) throws Exception {
        DadosCliente dados = new DadosCliente();
        return dados.listar(filtro);
    }
    
}
