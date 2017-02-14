package com.cherry.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cherry.model.Details;

@WebServlet("/det")
public class DetailsController extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
		 System.out.println("Servlet");
			String name=req.getParameter("n1");
			 System.out.println("Servlet");
			String	age=req.getParameter("a1");	
			 System.out.println("Servlet");
			String disease=req.getParameter("d");
			 System.out.println("Servlet");
			String 	date=req.getParameter("d1");
			Details.GetDetails(name,age,disease,date);
			 resp.sendRedirect("DetailStored.html");
		}
}
