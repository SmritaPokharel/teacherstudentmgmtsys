package com.academiamanagement.controller;

import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.academiamanagement.model.connector.Connector;
import com.academiamanagement.startup.DbConnection;

public class ContexListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context=sce.getServletContext();
        try {
			Connector connector = new Connector();
			DbConnection.connection=connector.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Connection Establised.........");
    }

    public void contextDestroyed(ServletContextEvent sce) {
       
    }

}
