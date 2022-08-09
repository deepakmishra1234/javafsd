package com.program.java;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	public class Validation extends HttpServlet 
	{
		
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		String s1=req.getParameter("user");
		String s2=req.getParameter("pass");
		
		if("sudheer".equals(s1) && "mohan".equals(s2)) {
			
			response(resp,"successfully login");
		}
		else {
			response(resp,"invalid login");
		}
		
	}
	private void response(HttpServletResponse resp,String str) throws IOException 
	{
		PrintWriter pw=resp.getWriter();
		
		pw.println("html");
		pw.println("body");
		pw.println("<h1>"+str+"<h1>");
		pw.println("/body");
		pw.println("/html");
	  }
	}



