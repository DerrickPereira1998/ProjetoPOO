package projetopoo;
import java.util.ArrayList;
public interface InterfaceCliente {
    void cadastrar(Cliente a) throws Exception;
    void deletar(Cliente a) throws Exception;
    void editar(Cliente a) throws Exception;
    ArrayList<Cliente> listar(Cliente filtro) throws Exception;
}
