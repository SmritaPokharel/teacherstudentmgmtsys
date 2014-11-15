package com.academiamanagement.model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.academiamanagement.model.dto.BankDTO;

public class BankRepository {
	
	public static String TABLE_NAME="bank";
	public static  Connection connection;
	private static  PreparedStatement preparedStatement;
	
	public static void insertBank(BankDTO bank) throws SQLException{
		String query ="INSERT INTO bank(name,address_id) values(?,?)";

		preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, bank.getName());
		preparedStatement.setLong(2, bank.getAddressId());
		preparedStatement.executeUpdate();
	}
	
	public static void getBankById(long bankId) throws SQLException{
		String query="Select * from bank where id=?";
		
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setLong(1, bankId);
		ResultSet resultSet = preparedStatement.executeQuery();
		
	}
	
	public static void findAllBank() throws SQLException{
		String query ="Select * from bank";

		preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		
	}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		BankRepository.connection = connection;
	}

	public static PreparedStatement getPreparedStatement() {
		return preparedStatement;
	}

	public static void setPreparedStatement(PreparedStatement preparedStatement) {
		BankRepository.preparedStatement = preparedStatement;
	}


}
