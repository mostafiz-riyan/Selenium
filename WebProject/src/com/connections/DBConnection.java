package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

		private static DBConnection instance=null;
		
		// JDBC driver name and database URL
		    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		    final String DB_URL = "jdbc:mysql://localhost:3306/muntasirdb";

		   //  Database credentials
		    final String USER = "root";
		    final String PASS = "admin";
		
		
		private DBConnection()
		{
			
		}
		
		public static synchronized DBConnection getInstance()
		{
			if(instance==null)
			{
				return new DBConnection();
			}
			else
			{
				return instance;
			}	
		}
		
		public Connection getConnection()
		{
			Connection connection=null;
			try {
				Class.forName(JDBC_DRIVER);
				try {
					connection = DriverManager.getConnection(DB_URL,USER,PASS);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection;
			
		}
}
