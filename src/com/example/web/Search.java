package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Search  extends PhoneBook{
	
	
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		
		
		
		
		
			response.setContentType("text/html");
						
			PrintWriter out = response.getWriter();
			out.println("Phone Book<br>");
			
			
			out.println("<br>Search contacts<br>");
			
			
			
					
	}
}
