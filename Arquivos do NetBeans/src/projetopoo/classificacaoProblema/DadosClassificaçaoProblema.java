package projetopoo.classificacaoProblema;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import projetopoo.utils.Conectar;

public class DadosClassificaçaoProblema extends Conectar implements InterfaceClassificaçao {
    @Override
    public void cadastrar(ClassificaçaoProblema a) throws Exception {
         //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "INSERT INTO classificacaoproblema (codigo,descricao,nome) ";
        sql += " VALUES (?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, a.getCodigo());
        preparedStatement.setString(2, a.getDescriçao());
        preparedStatement.setString(3, a.getNome());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }

    @Override
    public void deletar(ClassificaçaoProblema a) throws Exception {
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "DELETE FROM ClassificacaoProblema WHERE codigo = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, a.getCodigo());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }

    @Override
    public void editar(ClassificaçaoProblema a) throws Exception {
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "UPDATE ClassificacaoProblema SET nome = ?, descricao = ? WHERE codigo = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getNome());
        preparedStatement.setString(2, a.getDescriçao());
        preparedStatement.setInt(3, a.getCodigo());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }

    @Override
    public ArrayList<ClassificaçaoProblema> listar(ClassificaçaoProblema filtro) throws Exception {
       //variável de retorno
        ArrayList<ClassificaçaoProblema> retorno = new ArrayList<>();
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = " SELECT a.nome, a.codigo , a.descricao";
        sql += " FROM ClassificacaoProblema as a ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        //preparedStatement.setInt(1, a.getMatricula());
        // execute insert SQL stetement
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            ClassificaçaoProblema a = new ClassificaçaoProblema();
            a.setCodigo(rs.getInt("codigo"));
            a.setDescriçao(rs.getString("descricao"));
            a.setNome(rs.getString("nome"));
            retorno.add(a);
        }
        //fechar a conexão
        super.fecharConexao();
        return retorno;
    }
    
    
}

