package projetopoo;

import java.util.ArrayList;

public class NegocioOrdem implements InterfaceOrdem{

    @Override
    public void cadastrar(OrdemServiço a) throws Exception {
        
        DadosOrdemServiço dados = new DadosOrdemServiço();
        dados.cadastrar(a);
    }

    @Override
    public void deletar(OrdemServiço a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(OrdemServiço a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void solucionar(OrdemServiço a) throws Exception {
        if (a.getDescricaoservico() == null){
            throw new Exception("Informe a descrição do serviço prestado");                
        }
        if (a.getDescricaoservico().trim().length() > 255){
            throw new Exception("A descrição do problema devera ter no maximo até 255 caracteres");
        }
        DadosOrdemServiço dados = new DadosOrdemServiço();
        dados.solucionar(a);
    }

    @Override
    public void cancelar(OrdemServiço a) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<OrdemServiço> listar(OrdemServiço filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
