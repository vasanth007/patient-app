package com.cherry.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.core.Response;

import com.cherry.connection.*;



		public class Login
		{
		public static Boolean GetLogin(String user,String pass)
		{
		PreparedStatement ps=null;
		Connection con=null;
		String usr;
				String qry="select * from patientapp.register where pname=? and password=?";

			try 
			{
				con = Connect.connect();
				 ps = con.prepareStatement(qry);
				System.out.println("platform");
				ps.setString(1, user);
				ps.setString(2,pass);
				System.out.println("prepared statement");
				ResultSet rs = ps.executeQuery();
				if(rs.next())
				{
					usr = rs.getString("pname");
					System.out.println("welcome  "+usr);
					return true;
				}
				
				else
				{
					System.err.println("invalid user");
					return false;
				}
				
		 
			}
			 catch(ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try {
					Close.CloseCon(con,ps);
				}
				catch (SQLException e) 
				{
					
					e.printStackTrace();
				}
			}
			return null;

		}
	
}
