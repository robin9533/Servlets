package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegOne extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("uname");
		//httpsession interface
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		
		// cookies
		
		Cookie cname= new Cookie("cname",name);
		resp.addCookie(cname);
		
		/*
		 * resp.setContentType("text/html"); PrintWriter out = resp.getWriter();
		 * out.print("<form action='./regSrvTwo'>");
		 * out.print("Please enter Address<>");
		 * out.print("<input type='text' name='addr'/><br>");
		 * out.print("<input type='hidden' name='uname' value='"+name+"'/>");
		 * out.print("<input type='submit' value='submit'/>"); out.print("</form>");
		 */
		
		resp.sendRedirect("reqTwo.html?uname"+name);
		
	}

}
