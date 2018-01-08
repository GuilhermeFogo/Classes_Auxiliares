package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.MySQLConnection;
import com.mysql.jdbc.authentication.MysqlClearPasswordPlugin;

public class conecta {

	private Connection conexao;
	
	
	public Connection getConexao() {
		return conexao;
	}
	
	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}
	
	
	@SuppressWarnings("finally")
	public Connection conecta_db() throws SQLException {
		String mysql = "mysql";
		String nome_db= "";
		String usuario="root";
		String senha= "";
		String ip = "localhost";
		String jdbc = "jdbc:"+ mysql +"://"+ ip+"/"+ nome_db;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			setConexao(DriverManager.getConnection(jdbc));
		} catch (Exception e) {
			throw new RuntimeException();
		}finally {
			return getConexao();
		}
	}
	
}
