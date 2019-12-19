package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegTwo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//using hidden fileds the below code will wrk
		String name=req.getParameter("uname");
		
		/*
		 * HttpSession session = req.getSession(); String name = (String)
		 * session.getAttribute("name");
		 */
		
		/*
		 * Cookie[] cookies = req.getCookies(); for (Cookie cookie : cookies) {
		 * if(cookie.getName().equals("cname")) { name=cookie.getValue(); } }
		 */
		
		String addr=req.getParameter("addr");
		//get form1 data and form2 data and store in DBKJHGNBVCXZTDSXZ
		PrintWriter out = resp.getWriter();
		out.print("name"+name);
		out.print("addr "+addr);
	}

}
