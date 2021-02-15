package projetopoo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DadosOrdemServiço extends Conectar implements InterfaceOrdem{

    @Override
    public void cadastrar(OrdemServiço a) throws Exception {  
          //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "INSERT INTO ordemservico (descricaoproblema,datacadastro,"
                + "matricula_funcionario, cpf_cliente, codigo_classificacao ) "
         + " VALUES (?,?,?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getDescricaoproblema());
        preparedStatement.setDate(2, a.getDatacadastro());
        preparedStatement.setInt(3, a.getFuncionario().getMatricula());
        preparedStatement.setString(4, a.getCliente().getCpf());
        preparedStatement.setInt(5, a.getClassificaçaoProblema().getCodigo());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }

    @Override
    public void deletar(OrdemServiço a) throws Exception {
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "DELETE FROM ordemservico WHERE numero = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, a.getNumero());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }

    @Override
    public void editar(OrdemServiço a) throws Exception {
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "UPDATE ordemservico SET descricaoproblema = ?,descricaoservico = ?,motivocancelamento = ?,Datacancelamento = ?,Datasolucao = ?, matricula_funcionario = ? WHERE numero = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getDescricaoproblema());
        preparedStatement.setString(2, a.getDescricaoservico());
        preparedStatement.setString(3, a.getMotivocancelamento());
        preparedStatement.setDate(4, a.getDatacancelamento());
        preparedStatement.setDate(5, a.getDatasolucao());
        preparedStatement.setInt(6, a.getFuncionario().getMatricula());
        preparedStatement.setInt(7, a.getNumero());      
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }
    
     @Override
    public void solucionar(OrdemServiço a) throws Exception {
         //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "UPDATE  ordemservico SET descricaoservico = ?, datasolucao = ? ";
        sql += " WHERE numero = ?";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getDescricaoservico());
        preparedStatement.setDate(2, a.getDatasolucao());
        preparedStatement.setInt(3, a.getNumero());  
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }
    
     @Override
    public void cancelar(OrdemServiço a) throws Exception {
         //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "UPDATE  ordemservico SET motivocancelamento = ?, datacancelamento = ? ";
        sql += " WHERE numero = ?";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getMotivocancelamento());
        preparedStatement.setDate(2, a.getDatacancelamento());
        preparedStatement.setInt(3, a.getNumero());  
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }

    @Override
    public ArrayList<OrdemServiço> listar(OrdemServiço filtro) throws Exception {
        //variável de retorno
        ArrayList<OrdemServiço> retorno = new ArrayList<>();
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = " SELECT a.numero ,a.descricaoproblema, a.descricaoservico, a.motivocancelamento , a.datacadastro, a.datacancelamento,a.datasolucao,"
         + "a.matricula_funcionario, a.cpf_cliente, a.codigo_classificacao "       
         + " FROM ordemservico as a "
         + " WHERE a.numero > 0";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        //preparedStatement.setInt(1, a.getMatricula());
        // execute insert SQL stetement
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            OrdemServiço a = new OrdemServiço();
            a.setNumero(rs.getInt("numero"));
            a.setDescricaoproblema(rs.getString("descricaoproblema"));
            a.setDescricaoservico(rs.getString("descricaoservico"));
            a.setMotivocancelamento(rs.getString("motivocancelamento"));
            a.setDatacadastro(rs.getDate("datacadastro"));
            a.setDatacancelamento(rs.getDate("datacancelamento"));
            a.setDatasolucao(rs.getDate("datasolucao"));
            a.getClassificaçaoProblema().setCodigo(rs.getInt("codigo_classificacao"));
            a.getCliente().setCpf(rs.getString("cpf_cliente"));
            a.getFuncionario().setMatricula(rs.getInt("matricula_funcionario"));
            retorno.add(a);
        }
        //fechar a conexão
        super.fecharConexao();
        return retorno;
    }
        
}
