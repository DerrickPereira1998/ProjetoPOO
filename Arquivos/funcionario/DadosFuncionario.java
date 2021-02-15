package projetopoo.funcionario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import projetopoo.utils.Conectar;

public class DadosFuncionario extends Conectar implements InterfaceFuncionario {

    @Override
    public void cadastrar(Funcionario a) throws Exception {
         //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "INSERT INTO funcionario (cpf,rg,nome,matricula,salario) ";
        sql += " VALUES (?,?,?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getCpf());
        preparedStatement.setString(2, a.getRg());
        preparedStatement.setString(3, a.getNome());
        preparedStatement.setInt(4, a.getMatricula());
        preparedStatement.setFloat(5, a.getSalario());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }

    @Override
    public void deletar(Funcionario a) throws Exception {
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "DELETE FROM funcionario WHERE matricula = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, a.getMatricula());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }

    @Override
    public void editar(Funcionario a) throws Exception {
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = "UPDATE funcionario SET nome = ?,salario = ? WHERE matricula = ? ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, a.getNome());
        preparedStatement.setFloat(2, a.getSalario());
        preparedStatement.setInt(3, a.getMatricula());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechar a conexão
        super.fecharConexao();
    }

    @Override
    public ArrayList<Funcionario> listar(Funcionario filtro) throws Exception {
       //variável de retorno
        ArrayList<Funcionario> retorno = new ArrayList<>();
        //abrir uma conexão
        super.abrirConexao();
        //executar um SQL
        //instrucao a ser executada
        String sql = " SELECT a.matricula, a.nome, a.cpf , a.salario, a.rg";
        sql += " FROM funcionario as a ";
        sql += " WHERE a.matricula > 0 ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conn.prepareStatement(sql);
        //passando os valores para os parametros
        //preparedStatement.setInt(1, a.getMatricula());
        // execute insert SQL stetement
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            Funcionario a = new Funcionario();
            a.setCpf(rs.getString("cpf"));
            a.setNome(rs.getString("nome"));
            a.setSalario(rs.getFloat("salario"));
            a.setRg(rs.getString("rg"));
            a.setMatricula(rs.getInt("matricula"));
            retorno.add(a);
        }
        //fechar a conexão
        super.fecharConexao();
        return retorno;
    }
    
}
