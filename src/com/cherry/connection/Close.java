package com.cherry.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Close 
{
 public static void CloseCon(Connection con, PreparedStatement ps) throws SQLException
 {
	 System.out.println("connect");
	
	 con.close();
	 ps.close();
 }
}
