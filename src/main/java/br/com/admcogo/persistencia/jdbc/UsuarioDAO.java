package br.com.admcogo.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.admcogo.persistencia.entidade.Usuario;

public class UsuarioDAO {
	private Connection con = ConexaoFactory.getConnection();

	public void cadastrar(Usuario usu) {
		// TODO Auto-generated method stub
		String sql = "insert into filiados (nome, login, senha) values (?,?,?)";
		//Criando um statement
		try (PreparedStatement preparador = con.prepareStatement(sql)){;
			preparador.setString(1, usu.getNome()); //Substitui o ? pelo dado do usuário
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			//Executando o comando SQL no banco
			preparador.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void alterar(Usuario usu) {
		String sql = "update filiados set nome=?, login=?, senha=? where id=?";
		
		try (PreparedStatement preparador = con.prepareStatement(sql)){;
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4, usu.getId());
			
			
			preparador.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void excluir(Usuario usu) {
		String sql = "delete from filiados where id=?";
		
		try (PreparedStatement preparador = con.prepareStatement(sql)){;
			preparador.setString(1, usu.getNome());
			preparador.setString(1, usu.getLogin());
			preparador.setString(1, usu.getSenha());
			preparador.setInt(1, usu.getId());
			
			
			preparador.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
