package com.example.test;

import com.example.model.Phonebook;
import com.example.model.AddressBookPersist;
import com.example.model.Contact;

public class runTests {

	public static void main(String[] args) {
		
		 Contact c = new Contact("Rosie","Lickorish", "777");
		 AddressBookPersist addressBookPersist = new AddressBookPersist();
		 Phonebook ab = new Phonebook("ab");
		 
		AddTest addtest = new AddTest();
		ViewTest viewtest = new ViewTest();
		
		addtest.addTest(c, ab);
		viewtest.viewTest(ab);
	}
}
