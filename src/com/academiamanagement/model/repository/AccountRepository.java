package com.academiamanagement.model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.academiamanagement.model.dto.AccountDTO;


//create table address (id bigint(20) not null auto_increment, country varchar(255) not null, full_address varchar(255) , primary key(id))
public class AccountRepository {
	
	public static String TABLE_NAME="account";
	public static  Connection connection;
	private static  PreparedStatement preparedStatement;
	
	public static void insertAccount(AccountDTO account) throws SQLException{
		String query ="INSERT INTO account(balance,bank_id) values(?,?)";

		preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setDouble(1, account.getBalance());
		preparedStatement.setLong(2, account.getBankId());
		preparedStatement.executeUpdate();
		
		preparedStatement.setDouble(1,7777.77);
		preparedStatement.setLong(2, 2);
		preparedStatement.executeUpdate();
	}
	
	public static void getAccountById(long accountId) throws SQLException{
		String query="Select * from account where id=?";
		
		preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setLong(1, accountId);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			System.out.println(resultSet.getLong("id"));
			System.out.println(resultSet.getDouble(2));
			System.out.println(resultSet.getLong(3));
			
		ResultSet s=	preparedStatement.getResultSet();
		ResultSet s1=	preparedStatement.getResultSet();
		}
		
	}
	
	public static void findAccountByBank(long bankId) throws SQLException{
		String query ="Select * from account where bank_id=?";
		
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setLong(1, bankId);
		ResultSet resultSet = preparedStatement.executeQuery();
		
	}
	

}
