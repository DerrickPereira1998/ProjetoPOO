package projetopoo.classificacaoProblema;
import java.util.ArrayList;
public interface InterfaceClassificaçao {
    void cadastrar(ClassificaçaoProblema a) throws Exception;
    void deletar(ClassificaçaoProblema a) throws Exception;
    void editar(ClassificaçaoProblema a) throws Exception;
    ArrayList<ClassificaçaoProblema> listar(ClassificaçaoProblema filtro) throws Exception;
}
