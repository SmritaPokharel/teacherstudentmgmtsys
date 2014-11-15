package com.academiamanagement.model.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connector {
	
	private Connection connection;
	private PreparedStatement preparedStatement;
	
	private String databaseUrl="jdbc:mysql://localhost/academiabanking";
	private String userName="root";
	private String password="";
	
	
	
	public Connector() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(databaseUrl,userName,password);

	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public void closeConnection() throws SQLException{
		connection.close();
	}
	
	

}
