package com.healthtrack.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	// comentei aqui porque ainda não sei como utilizar variável de ambiente com Java
	//private static final String USER_DB = "";
	//private static final String PWD_DB = "";
	
	private static ConnectionManager instance;
	private static Connection conn;
	
	private ConnectionManager() {}
	
	public static ConnectionManager getInstance() {
		if (instance == null) {
			instance = new ConnectionManager();
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		try {
			
			if ((ConnectionManager.conn == null) || (ConnectionManager.conn.isClosed())) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", USER_DB, PWD_DB);
			} else {
				System.out.println("Utilizando a conexão Singleton");
			}
			
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new SQLException(e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new SQLException(e.getMessage());
		}
		
	}
	
	public void closeConnection() throws SQLException {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("Conexão Singleton fechada");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException(e.getMessage());
		}
	}
	
	
	
}