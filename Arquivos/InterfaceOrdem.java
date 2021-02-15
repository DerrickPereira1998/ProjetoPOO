package projetopoo;
import java.util.ArrayList;
public interface InterfaceOrdem {
    void cadastrar(OrdemServiço a) throws Exception;
    void deletar(OrdemServiço a) throws Exception;
    void editar(OrdemServiço a) throws Exception;
    void solucionar(OrdemServiço a) throws Exception;
    void cancelar(OrdemServiço a) throws Exception;
    ArrayList<OrdemServiço> listar(OrdemServiço filtro) throws Exception;
}
