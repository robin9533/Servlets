package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoRedirector extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2580568846141251092L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		PrintWriter out = resp.getWriter();
		out.print("im in Srvone");
	//	resp.sendRedirect("https://www.google.com/");

	}

}
