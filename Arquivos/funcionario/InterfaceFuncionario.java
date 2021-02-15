package projetopoo.funcionario;
import java.util.ArrayList;
public interface InterfaceFuncionario {
    void cadastrar(Funcionario a) throws Exception;
    void deletar(Funcionario a) throws Exception;
    void editar(Funcionario a) throws Exception;
    ArrayList<Funcionario> listar(Funcionario filtro) throws Exception;
}
