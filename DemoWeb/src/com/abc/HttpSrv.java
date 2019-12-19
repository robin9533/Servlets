package com.abc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HttpSrv extends HttpServlet{

 
	/**
	 * 
	 */
	private static final long serialVersionUID = 7075545043396476894L;


	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
	
	
	public void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.print(new Date());
		System.out.println("process");
		String ip = req.getRemoteAddr();
		req.getQueryString();
		
		req.getRequestURI();
		req.getRemotePort();
		
		
	
		if(ip.equals("135.663.475")) {
			 		}
     	
	}
}
