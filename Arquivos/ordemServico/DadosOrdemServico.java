package projetopoo.ordemServico;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import projetopoo.utils.Conectar;

public class DadosOrdemServico extends Conectar implements InterfaceOrdem{

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
        preparedStatement.setString(4, a.getCliente_().getCpf());
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
        String sql = "UPDATE ordemservico SET descricaoproblema = ?, matricula_funcionario = ?,cpf_cliente =?, codigo_classificacao = ?  WHERE numero = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getDescricaoproblema());
        preparedStatement.setInt(2, a.getFuncionario().getMatricula());
        preparedStatement.setString(3, a.getCliente_().getCpf());
        preparedStatement.setInt(4, a.getClassificaçaoProblema().getCodigo());
        preparedStatement.setInt(5, a.getNumero());      
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
        String sql = " SELECT os.numero, os.motivocancelamento, os.datacadastro, os.datasolucao, os.descricaoproblema, os.datacancelamento,"
                +  " os.descricaoservico, os.motivocancelamento, os.cpf_cliente, cl.rg, cl.nome, os.matricula_funcionario, fu.nome, fu.salario, fu.rg, fu.cpf,"
                +  " os.codigo_classificacao, cla.nome, cla.descricao\n"
                +  " FROM ordemservico as os\n" 
                +  " INNER JOIN cliente as cl on os.cpf_cliente = cl.cpf\n" 
                +  " INNER JOIN funcionario as fu on os.matricula_funcionario = fu.matricula\n" 
                +  " INNER JOIN classificacaoproblema as cla on os.codigo_classificacao = cla.codigo\n" 
                +  " WHERE os.numero > 0";
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
            a.getCliente_().setCpf(rs.getString("cpf_cliente"));
            a.getFuncionario().setMatricula(rs.getInt("matricula_funcionario"));
            a.getFuncionario().setNome(rs.getString("fu.nome"));
            a.getCliente_().setNome(rs.getString("cl.nome"));
            a.getClassificaçaoProblema().setNome(rs.getString("cla.nome"));
            retorno.add(a);
        }
        //fechar a conexão
        super.fecharConexao();
        return retorno;
    }
        
}
