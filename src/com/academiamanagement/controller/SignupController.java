package com.academiamanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.academiamanagement.model.dto.AddressDTO;
import com.academiamanagement.service.RegistrationService;

/**
 * Servlet implementation class SignupController
 */
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request.getRequestDispatcher("pages/signup.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String country = request.getParameter("country");
		String fullAddress = request.getParameter("fullAddress");
		
		AddressDTO address = new AddressDTO();
		address.setCountry(country);
		address.setFullAddress(fullAddress);
		RequestDispatcher view;
		try{
			RegistrationService.addAddress(address);
			view = request.getRequestDispatcher("pages/success.jsp");
		}
		catch(Exception e){
			view = request.getRequestDispatcher("pages/error.jsp");
		}
		
		
		
		view.forward(request, response);
		
//		String lastName = (String)request.getAttribute("lastName");
		
		
	}

}
