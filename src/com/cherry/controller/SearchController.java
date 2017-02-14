package com.cherry.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cherry.model.Search;

@WebServlet("/ser")
public class SearchController extends HttpServlet
{
	protected void doPost(HttpServletRequest request,
		    HttpServletResponse response)
		        throws ServletException, IOException 
	{
		String name = request.getParameter("t1");
		 Search.GetSearch(name, response);
	}
}
