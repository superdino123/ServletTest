package com.blog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name = "multiValueParameterServlet",
		urlPatterns = {"/checkboxes"}
)
public class MultiValueParameterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = response.getWriter();
		writer.append("<!DOCTYPE html>\r\n")
			  .append("<html>\r\n")
			  .append("		<head>\r\n")
			  .append(" 		<title>Hello User Application</title>\r\n")
			  .append("		</head>\r\n")
			  .append("		<body>\r\n")
			  .append("			<form action=\"checkboxes\" method=\"POST\">\r\n")
			  .append("Select the fruits you like to eat:<br/>\r\n")
			  .append("<input type=\"checkbox\" name=\"fruit\" value=\"Banana\"/>\r\n")
			  .append("Banana\r\n")
			  .append("<input type=\"checkbox\" name=\"fruit\" value=\"Apple\"/>\r\n")
			  .append("Apple\r\n")
			  .append("<input type=\"checkbox\" name=\"fruit\" value=\"Orange\"/>\r\n")
			  .append("Orange\r\n")
			  .append("<input type=\"checkbox\" name=\"fruit\" value=\"Guava\"/>\r\n")
			  .append("Guava\r\n")
			  .append("<input type=\"checkbox\" name=\"fruit\" value=\"Kiwi\"/>\r\n")
			  .append("Kiwi\r\n")
			  .append("<input type=\"submit\" value=\"Submit\"/>\r\n")
			  .append("			</form>")
			  .append("		</body>\r\n")
			  .append("</html>\r\n");  
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		String[] fruits = request.getParameterValues("fruit");
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = response.getWriter();
		writer.append("<!DOCTYPE html>\r\n")
			  .append("<html>\r\n")
			  .append("		<head>\r\n")
			  .append(" 		<title>Hello User Application</title>\r\n")
			  .append("		</head>\r\n")
			  .append("		<body>\r\n")
			  .append(" 		<h2>Your Selctions</h2>\r\n");
		
		if(fruits == null)
			writer.append("		You did not select any fruits.\r\n");
		else {
			writer.append("		<ul>\r\n");
			for(String fruit : fruits) {
				writer.append("		<li>").append(fruit).append("</li>\r\n");
			}
			writer.append("		</ul>\r\n");
		}
		writer.append("		</body>\r\n")
			  .append("</html>\r\n");
	}
}
