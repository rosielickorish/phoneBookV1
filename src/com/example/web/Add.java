package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.Phonebook;
import com.example.model.AddressBookPersist;
import com.example.model.Contact;

public class Add extends PhoneBook{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		

		name= request.getParameter("First Name");
		secondname = request.getParameter("Second Name");
		phonenumber = request.getParameter("Phone Number");
		
		 Contact c = new Contact(name, secondname, phonenumber);
		 
		ab.addContact(c);
		addressBookPersist.addAddressBook(ab);
		
		
			response.setContentType("text/html");
						
			PrintWriter out = response.getWriter();
			out.println("Phone Book<br>");
			
			
			out.println("<br>Got contact name " + c +  "<br>");
			
			
			
					
	}
	
}
