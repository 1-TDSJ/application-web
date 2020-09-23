package br.com.fiap.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private Connection connection;
	
	public void DBConnectionManager(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.OracleDriver");
		this.connection = DriverManager.getConnection(dbURL,user,pwd);
		
	}
	
	public Connection getConnection() {
		return this.connection;
	}
	
}
