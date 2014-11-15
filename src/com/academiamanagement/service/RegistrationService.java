package com.academiamanagement.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.academiamanagement.model.dto.AddressDTO;
import com.academiamanagement.model.repository.AddressRepository;
import com.academiamanagement.startup.DbConnection;

public class RegistrationService {
	
	public static AddressDTO addAddress(AddressDTO addressDto) throws SQLException{
		AddressRepository.connection=DbConnection.connection;
		AddressRepository.insertAddress(addressDto);
		return addressDto;
	}


		
}
