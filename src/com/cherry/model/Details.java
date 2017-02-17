package com.cherry.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.cherry.connection.*;



public class Details 
{
	public static void GetDetails(String name,String age,String disease,String date)
	{
		Connection con=null;
		PreparedStatement ps=null;
		 String sql="insert into patientapp.patient_details values(?,?,?,?)";
		try 
		{
			con = Connect.connect();
			System.out.println("connected");
			ps = con.prepareStatement(sql);
			System.out.println("platform");
			ps.setString(1,name);
			ps.setString(2,age);
			ps.setString(3,disease);
			ps.setString(4,date);
	        ps.executeUpdate();
	        System.out.println("1231455312313");
	       
//		 PrintWriter pw = resp.getWriter();   
//		  pw.println("<html><body><h1>"+"details stored your name= "+name+"</h1></body></html>");
//		  pw.println("<html><body><h1>login <a href='/Patientapp/CheckDetails.html'> here</a></h1></body></html>");
//		 
 }
	 
		  catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
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
