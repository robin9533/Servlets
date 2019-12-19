package com.abc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DemoListner implements ServletContextListener {
	
	
	
	 public void contextInitialized(ServletContextEvent sce) {
		 
		 System.out.println("im in contextInitialized ");
		 sce.getServletContext().setAttribute("name","vamsi");
		 
	 }

	     
	    public void contextDestroyed(ServletContextEvent sce) {
	    	
	    	
	}
}
