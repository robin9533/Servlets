package com.abc;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoSconfig extends GenericServlet {
	
	//private ServletConfig gconfig;
	
	/*
	 * @Override public void init(ServletConfig config) throws ServletException {
	 * //gconfig=config;
	 * 
	 * //cusotom logivc goes here
	 * 
	 * super.init(config); }
	 */

	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//approach1
		ServletConfig config =getServletConfig();
		
		//config.getServletContext()
		String name=config.getInitParameter("driver");
		System.out.println(name);
		
		Enumeration<String> initParmNames = config.getInitParameterNames();
		while (initParmNames.hasMoreElements()) {
			String param = (String) initParmNames.nextElement();
			String value=config.getInitParameter(param);
			System.out.println(value);
		}
		
		ServletContext cxt=getServletContext();
		String count=cxt.getInitParameter("count");
		int a = (int) cxt.getAttribute("a");
		System.out.println(count);
		System.out.println("a is :"+a);
		
	}
	 

}
