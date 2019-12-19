package com.abc;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoCtx extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1084333950342398208L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
 
		ServletContext cxt=getServletContext();
		String count=cxt.getInitParameter("count");
		cxt.setAttribute("a", 100);
		System.out.println(count);
		
	}
	
	

}
