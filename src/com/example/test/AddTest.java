package com.example.test;

import java.io.PrintWriter;

import com.example.model.*;

public class AddTest {
	
	public void addTest(Contact c, Phonebook ab){
	
		ab.addContact(c);
		ab.storeContact(c);
		ab.readContacts(c);
	
		
		System.out.println("Phone Book<br>");
		System.out.println("Got contact name " + ab.readContacts(c));
	}

}
