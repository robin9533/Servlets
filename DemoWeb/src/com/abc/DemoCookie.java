package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoCookie extends HttpServlet{
	
	private Cookie c;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		c = new Cookie("demoCookie", "Test123");
		c.setMaxAge(1000);
 		c.setComment("This is  a demo cookie");
		PrintWriter out = resp.getWriter();
		out.print("my Cookie name is "+c.getName());
		out.print("my Cookie age is "+c.getMaxAge());
		resp.addCookie(c);
		
		
		Cookie[] cookies = req.getCookies();
		for (Cookie cookie : cookies) {
		
			if(cookie.getName().equals("demoCookie")) {
				//get valie
				
				
				
			}
		}
	}

}
