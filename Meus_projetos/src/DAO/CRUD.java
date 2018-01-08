package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.mysql.jdbc.MySQLConnection;
import com.mysql.jdbc.MysqlIO;

import Pacotes.Contatos;

public class CRUD extends conecta {
	
	public void insere(Contatos contato) throws SQLException {
		try {
			String sql = "insert into Contato (nome,senha,email,telefone) "
					+ "values(?,?,?,?)";
			
			PreparedStatement prepare = prepare_sql(contato, sql);
			
			prepare.execute();
			prepare.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			getConexao().close();
		}
	}

	private PreparedStatement prepare_sql(Contatos contato, String sql) throws SQLException {
		PreparedStatement prepare = getConexao().prepareStatement(sql);
		prepare.setString(1, contato.getNome());
		prepare.setString(2, contato.getSenha());
		prepare.setString(3,contato.getEmail());
		prepare.setString(4, contato.getTelefone());
		prepare.setLong(5, contato.getId());
		return prepare;
	}
	
	public void delete(Contatos contato) throws SQLException {
		try{
			
			String sql = "delete from Contato where id="+ contato.getId();
		 PreparedStatement prepare = prepare_sql(contato, sql);
		prepare.execute();
		prepare.close();
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			getConexao().close();
		}
	}
	
	public void Update(Contatos contato) throws SQLException {
		try {
			String sql = "update Contato set nome=?, senha =? email=?, telefone =? where id=?";
			PreparedStatement prepare = getConexao().prepareStatement(sql);
			prepare.setString(1, contato.getNome());
			prepare.executeQuery();
			prepare.close();
		}catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		} 
		finally {
			getConexao().close();
		}
	}
	
	@SuppressWarnings("finally")
	public List<Contatos> busca_conato() throws SQLException {
		List<Contatos> lista_conato = new ArrayList<>();
		try {
			Contatos contato = new Contatos();
			String sql = "select * from Contatos";
			PreparedStatement prepare = getConexao().prepareStatement(sql);
			ResultSet rs = prepare.executeQuery();
			
			while (rs.next()) {
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setId(rs.getLong("id"));
				contato.setSenha(rs.getString("senha"));
				
				lista_conato.add(contato);
			}
			prepare.close();
			
		} catch (Exception e) {
			System.exit(0);
			System.exit(0);
		}finally {
			getConexao().close();
			return lista_conato;
		}
	}
}
