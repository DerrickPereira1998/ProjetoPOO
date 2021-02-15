package projetopoo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    public Connection conn;
    //constantes com os valores para os drivers de conexão
    private String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
    //String DRIVER_POSTGRESQL = "org.postgresql.Driver";
    //String DRIVER_SQLSERVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //constantes com os valores para os parâmetros de conexão
    private String LOCAL_SERVIDOR = "localhost";
    private String BANCO_DE_DADOS = "projetopoo";
    private String PORTA_BANCO = "3306";
    private String USUARIO = "root";
    private String SENHA = "";
    
    public void abrirConexao() throws Exception {
        //vinculando o driver que será utilizado
        Class.forName(DRIVER_MYSQL).newInstance();
        //construção da URL de conexão
        String url = "jdbc:mysql://" + LOCAL_SERVIDOR + ":" + PORTA_BANCO + "/" + BANCO_DE_DADOS;
        //estabelecendo a conexão
        conn = (Connection) DriverManager.getConnection(url, USUARIO, SENHA);
    }
    
    public void fecharConexao() throws Exception{
        conn.close();
    }
}
