package com.blog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name = "noteServletParameterServlet",
		urlPatterns = {"/noteServletParameters"},
		initParams = {
				@WebInitParam(name = "database", value = "CustomerSupport"),
				@WebInitParam(name = "server", value = "10.0.12.5")
		}
)
public class NoteServletParameterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		ServletConfig c = this.getServletConfig();
		PrintWriter writer = response.getWriter();
		
		writer.append("database: ").append(c.getInitParameter("database"))
			  .append(", server: ").append(c.getInitParameter("server"));
	}
}
