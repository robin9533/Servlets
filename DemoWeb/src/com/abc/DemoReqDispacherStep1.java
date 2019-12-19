package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoReqDispacherStep1 extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3658415655520213811L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		try {
			//PrintWriter out = resp.getWriter();
			PrintWriter out =null;
			System.out.println("im in Srvone");
			//req.setAttribute(name, o);
			
			RequestDispatcher rd1= getServletContext().getRequestDispatcher("/ReqDispacherStep2");
			//RequestDispatcher rd2= getServletContext().getNamedDispatcher(name)
			//RequestDispatcher rd3=req.getRequestDispatcher(path);
			rd1.include(req, resp);
			out.print("im in Srvone end");
		} catch (NullPointerException e) {
			 //resp.sendError(500, "error.html");  		}
			resp.sendRedirect("/DemoWeb/error.html");
		}

	}

}
