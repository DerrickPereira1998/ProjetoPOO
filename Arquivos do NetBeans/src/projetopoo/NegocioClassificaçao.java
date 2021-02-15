package projetopoo;

import java.util.ArrayList;

public class NegocioClassificaçao implements InterfaceClassificaçao {

    @Override
    public void cadastrar(ClassificaçaoProblema a) throws Exception {        
        if (a == null) {
            throw new Exception("Informar os dados da classificação");
        }
        /*if (a.getCodigo() <= 0) {
            throw new Exception("A matricula do aluno deverá ser superior a zero");
        }
        if (a.getCodigo()!= 1) {
            throw new Exception("A matricula do aluno deverá so ter um digito");
        }*/
        if (a.getDescriçao().trim().length() > 200) {
            throw new Exception("A descrição deverá ter no máximo 200 caracteres");
        }
        if (a.getNome().trim().length() > 30) {
            throw new Exception("O nome da descrição deverá ter no máximo 30 caracteres");
        }
        if (a.getNome() == null) {
            throw new Exception("Informar o nome do aluno");
        }
        DadosClassificaçaoProblema dados = new DadosClassificaçaoProblema();
        dados.cadastrar(a);
    }

    @Override
    public void deletar(ClassificaçaoProblema a) throws Exception {
        if (a == null) {
            throw new Exception("Informar os dados da classificação");
        }
        if (a.getCodigo() < 0) {
            throw new Exception("A matricula do aluno deverá ser superior a zero");
        }
        DadosClassificaçaoProblema dados = new DadosClassificaçaoProblema();
        dados.deletar(a);
    }

    @Override
    public void editar(ClassificaçaoProblema a) throws Exception {
        if (a.getCodigo() <= 0) {
            throw new Exception("A matricula do aluno deverá ser superior a zero");
        }
        DadosClassificaçaoProblema dados = new DadosClassificaçaoProblema();
        dados.editar(a);
    }

    @Override
    public ArrayList<ClassificaçaoProblema> listar(ClassificaçaoProblema filtro) throws Exception {
        DadosClassificaçaoProblema dados = new DadosClassificaçaoProblema();
        return dados.listar(filtro);
    }
    
}
