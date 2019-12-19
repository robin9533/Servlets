package com.abc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DemoSession extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9036870271889669428L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String id= session.getId();
		
	 
		session.getLastAccessedTime();
		session.getMaxInactiveInterval();
		session.setMaxInactiveInterval(100000);
		Date d = new Date(session.getCreationTime());
		
		int count =0;
		if(session.isNew()) {
			
			count++;
			session.setAttribute("count", count);
		}else {
			count = (int) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}
		
		PrintWriter out = resp.getWriter();
		out.print("Jsession id is "+id+"<br>");
		out.print("CreationTime is "+d+"<br>");
		out.print("U have visted  "+count+"<br>");
		
		session.invalidate();
		
		
	}

}
