package com.cherry.controller;

import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cherry.model.Details;

@Path("det")
public class DetailsController{

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED) 
	public Response service(@FormParam("n1") String name,@FormParam("a1") String age,@FormParam("d") String disease ,@FormParam("d1") String date)
	{
		Details.GetDetails(name, age, disease, date);
		try{
			System.out.println("inside details");
			java.net.URI location;
			location = new java.net.URI("../DetailStored.html");
			return Response.temporaryRedirect(location).build();

			} catch (URISyntaxException e) {
			e.printStackTrace();

			}
//			System.out.println("Servlet");
//			String name=req.getParameter("n1");
//			 System.out.println("Servlet");
//			String	age=req.getParameter("a1");	
//			 System.out.println("Servlet");
//			String disease=req.getParameter("d");
//			 System.out.println("Servlet");
//			String 	date=req.getParameter("d1");
//			Details.GetDetails(name,age,disease,date);
//			 resp.sendRedirect("DetailStored.html");
		return null;
		}
}
