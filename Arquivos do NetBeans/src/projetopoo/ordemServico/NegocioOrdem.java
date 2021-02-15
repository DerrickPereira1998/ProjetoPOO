package projetopoo.ordemServico;

import java.util.ArrayList;

public class NegocioOrdem implements InterfaceOrdem{

    @Override
    public void cadastrar(OrdemServiço a) throws Exception {
        
        DadosOrdemServico dados = new DadosOrdemServico();
        dados.cadastrar(a);
    }

    @Override
    public void deletar(OrdemServiço a) throws Exception {
        if (a == null) {
            throw new Exception("Informar os dados da ordem");
        }
        if (a.getNumero() <= 0) {
            throw new Exception("O codigo da ordem deverá ser superior a zero");
        }
        DadosOrdemServico dados = new DadosOrdemServico();
        dados.deletar(a);
    }

    @Override
    public void editar(OrdemServiço a) throws Exception {
        DadosOrdemServico dados = new DadosOrdemServico();
        dados.editar(a);
    }

    @Override
    public void solucionar(OrdemServiço a) throws Exception {
        if (a.getDescricaoservico().trim().length() > 255){
            throw new Exception("A descrição do serviço devera ter no maximo até 255 caracteres");
        }
        if (a.getDatacancelamento() != null){
            throw new Exception("Uma ordem cancelada não pode ser solucionada.");
        }
        DadosOrdemServico dados = new DadosOrdemServico();
        dados.solucionar(a);
    }

    @Override
    public void cancelar(OrdemServiço a) throws Exception {
        if (a.getDescricaoservico().trim().length() > 255){
            throw new Exception("O motivo do cancelamento devera ter no maximo até 255 caracteres");
        }
        if (a.getDatasolucao()!= null){
            throw new Exception("Uma ordem solucionada não pode ser cancelada.");
        }
        DadosOrdemServico dados = new DadosOrdemServico();
        dados.cancelar(a);
    }

    @Override
    public ArrayList<OrdemServiço> listar(OrdemServiço filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
