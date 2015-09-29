package com.example.web;

import com.example.model.*;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


//AddContact
public class PhoneBook extends HttpServlet{
	
	String name;
	String secondname;
	String phonenumber;
	
	 
	 AddressBookPersist addressBookPersist = new AddressBookPersist();
	 Phonebook ab = new Phonebook("ab");
	 
	 public  void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException { }

		
		
}


