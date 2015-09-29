package com.example.model;

import java.io.Serializable;
import java.util.Comparator;

public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String secondname;
    private String phoneNumber;

    public Contact(String name, String secondname, String phonenumber) {
        this.name = name;
        this.secondname = secondname;
        this.phoneNumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
        return name + ", " + secondname + ", " + phoneNumber;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            return (name.equals(contact.getName()) && phoneNumber
                    .equals(contact.getPhoneNumber()));
        }

        return false;
    }

    public int hashCode() {
        return (name.length() + secondname.length() + phoneNumber.length());
    }
}

class ContactNameComparator implements Comparator<Contact> {
    public int compare(Contact contact1, Contact contact2) {
        return contact1.getSecondname().compareToIgnoreCase(contact2.getSecondname());
    }
}
