package com.example.test;

import com.example.model.Phonebook;
import com.example.model.AddressBookPersist;
import com.example.model.Contact;

public class ViewTest {

	public void viewTest(Phonebook ab) {
			
			
			ab.viewAllContacts(ab);
			// This test fails because of a classCastException in AddressBook.veiwAllContacts
		
		}
	

}
