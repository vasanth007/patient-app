package com.cherry.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cherry.model.*;

@WebServlet("/reg")
public class RegisterController extends HttpServlet
{
	static String name;	
	
	public static String getName()
	{
		return name;
	}
	
	 @Override
	 protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	  {
		 name=req.getParameter("n1");
		 String	pass=req.getParameter("a1");	
		 Register.GetReg(name,pass);
		 resp.sendRedirect("Reg.jsp");
	  }
	 
}
