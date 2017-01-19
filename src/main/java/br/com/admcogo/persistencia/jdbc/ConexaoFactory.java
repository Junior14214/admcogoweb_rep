package br.com.admcogo.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	public static Connection getConnection(){
		
		
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/admcogoweb", "postgres", "96282518");
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
		
	}

}
