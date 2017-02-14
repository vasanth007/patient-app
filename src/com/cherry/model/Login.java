package com.cherry.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cherry.connection.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


		public class Login
		{
		public static void GetLogin(String user,String pass)
		{
		PreparedStatement ps=null;
		Connection con=null;
		String usr="";
				String qry="select * from patientapp.register where pname=? and password=?";
		   		//  PrintWriter pw = response.getWriter();
			try 
			{
				con = Connect.connect();
				 ps = con.prepareStatement(qry);
				System.out.println("platform");
				ps.setString(1, user);
				ps.setString(2,pass);
				System.out.println("aaaa");
				ResultSet rs = ps.executeQuery();
				if(rs.next())
				{
				usr = rs.getString("pname");
				System.out.println("welcome  "+usr);
				//name_1=usr;
				// PrintWriter pw = response.getWriter();   
//				  pw.println("<html><body><h1>"+"welcome "+ usr +"</h1></body></html>");
//				  pw.println("<html><body><h1>enter details <a href='/Patientapp/patdetails.html'> here</a></h1></body></html>");
				}
				else
				{
					System.err.println("invalid user");
//					pw.println("<html><body><h1>"+"invalid user"+"</h1></body></html>");
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
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	
}
