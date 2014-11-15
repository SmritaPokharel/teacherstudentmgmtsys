package com.academiamanagement.model.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.academiamanagement.model.dto.AddressDTO;

public class AddressRepository {
	
	public static String TABLE_NAME="account";
	public static  Connection connection;
	private static  PreparedStatement preparedStatement;
	
	public static void insertAddress(AddressDTO address) throws SQLException{
		String query ="INSERT INTO address(country,full_address) values(?,?)";

		preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, address.getCountry()+"");
		preparedStatement.setString(2, address.getFullAddress());
		preparedStatement.executeUpdate();
	}
	
	public static void getAddressById(long addressId) throws SQLException{
		String query="Select * from address where id=?";
		
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setLong(1, addressId);
		ResultSet resultSet = preparedStatement.executeQuery();
		
	}
	
	public static void findAddressByCountry(String country) throws SQLException{
		String query ="Select * from address where country=?";
		
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, country);
		ResultSet resultSet = preparedStatement.executeQuery();
		
	}

}
