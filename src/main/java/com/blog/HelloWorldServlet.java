package com.blog;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException
	{
		response.getWriter().println("Hello, World!");
	}
	
	public void init() throws ServletException{
		System.out.println("Servlet " + this.getServletName() + " has started.");
	}
	
	public void destroy() {
		System.out.println("Servlet " + this.getServletName() + " has stopped.");
	}
	
}
