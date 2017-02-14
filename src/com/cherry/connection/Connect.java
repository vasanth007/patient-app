package com.cherry.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect 
{
public static Connection connect() throws ClassNotFoundException, SQLException
		{
			Connection con;
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("jdbc code starts");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=dinga");
			System.out.println("connected");
			  
		
	return con;
	}
	}
