package com.cherry.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cherry.model.*;

@WebServlet("/log")
public class LoginController extends HttpServlet 
{
		static String name_1;
		
		protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
		{
			String user = request.getParameter("n1");
			String pass = request.getParameter("p1");
			 HttpSession session = request.getSession();
			    session.setAttribute("userName", user);
			    String userName = (String) session.getAttribute("userName");
			    System.out.println(userName);
        Login.GetLogin(user,pass);
        name_1=user;
        response.sendRedirect("Weluser.jsp");
		}
		public static String Get()
		{
			return name_1;
			
		}
}
