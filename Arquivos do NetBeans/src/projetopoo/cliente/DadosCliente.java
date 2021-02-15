package projetopoo.cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import projetopoo.utils.Conectar;

public class DadosCliente extends Conectar implements InterfaceCliente {
    @Override
    public void cadastrar(Cliente a) throws Exception {
         //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "INSERT INTO cliente (cpf,rg,nome) ";
        sql += " VALUES (?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getCpf());
        preparedStatement.setString(2, a.getRg());
        preparedStatement.setString(3, a.getNome());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }

    @Override
    public void deletar(Cliente a) throws Exception {
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "DELETE FROM cliente WHERE cpf = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getCpf());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }

    @Override
    public void editar(Cliente a) throws Exception {
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "UPDATE cliente SET nome = ?,rg = ? WHERE cpf = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getNome());
        preparedStatement.setString(2, a.getRg());
        preparedStatement.setString(3, a.getCpf());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }

    @Override
    public ArrayList<Cliente> listar(Cliente filtro) throws Exception {
       //variável de retorno
        ArrayList<Cliente> retorno = new ArrayList<>();
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = " SELECT a.nome, a.cpf , a.rg";
        sql += " FROM cliente as a ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        //preparedStatement.setInt(1, a.getMatricula());
        // execute insert SQL stetement
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            Cliente a = new Cliente();
            a.setCpf(rs.getString("cpf"));
            a.setNome(rs.getString("nome"));
            a.setRg(rs.getString("rg"));
            retorno.add(a);
        }
        //fechar a conexão
        super.fecharConexao();
        return retorno;
    }
    
    public boolean verificaUso(Cliente filtro) throws Exception {
       //variável de retorno
        boolean retorno = false;
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = " SELECT DISTINCT cpf_cliente ";
        sql += " FROM ordemservico ";
        sql += " WHERE cpf_cliente = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        preparedStatement.setString(1, filtro.getCpf());
        //passando os valores para os parametros
        //preparedStatement.setInt(1, a.getMatricula());
        // execute insert SQL stetement
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            retorno = true;
            break;
        }
        //fechar a conexão
        super.fecharConexao();
        return retorno;
    }
    
    
}
