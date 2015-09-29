package com.example.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Phonebook implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private List<Contact> contacts;

    public Phonebook(String name) {
        this(name, new ArrayList<Contact>());
    }

    public Phonebook(String name, List<Contact> contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addContact(Contact contact) {
        if (contacts != null) {
            contacts.add(contact);
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    
    public void storeContact(Contact contact) {
    	try {
            FileOutputStream fileStream = new FileOutputStream("C:\\Users\\IBM_ADMIN\\workspace\\WebDev_Luna\\phoneBookV1\\src\\com\\example\\model\\PhoneBook.txt");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(contact);
            os.close();

            System.out.println("Stored Contact " + contact.getName());
        } catch (IOException e) {

            System.out.println("Nothing stored");
            e.printStackTrace();
        }

    }

    public Contact readContacts(Contact contactRestored){
    	
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                    "C:\\Users\\IBM_ADMIN\\workspace\\WebDev_Luna\\phoneBookV1\\src\\com\\example\\model\\PhoneBook.txt"));
     
              contactRestored = (Contact) ois.readObject();
                System.out.println("theres somehting to read : " + contactRestored);
                
 
            ois.close();

            
        } catch (EOFException ex) {
        	 ex.printStackTrace();
            System.out.println(" exception");
        }catch (FileNotFoundException ex) {
            System.out.println("No address books stored");
        } catch (Exception e) {
            e.printStackTrace();
        }

       return contactRestored;
    }
    
    public List<Phonebook> readAddressBooks() {
        List<Phonebook> addressBooks = new ArrayList<Phonebook>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                    "AddressBooks.txt"));
            if(ois.readObject() != null){
                addressBooks = (List<Phonebook>) ois.readObject();
            }
            ois.close();
        } catch (EOFException ex) {
            System.out.println("");
        }catch (FileNotFoundException ex) {
            System.out.println("No address books stored");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return addressBooks;
    }
    
    public Phonebook viewAllContacts(Phonebook ab){
    	ab = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                    "C:\\Users\\IBM_ADMIN\\workspace\\WebDev_Luna\\phoneBookV1\\src\\com\\example\\model\\PhoneBook.txt"));
              
              ab = (Phonebook) ois.readObject();
                System.out.println("theres somehting to read : " + ab);
                
 
            ois.close();

            
        } catch (EOFException ex) {
        	 ex.printStackTrace();
            System.out.println(" exception");
        }catch (FileNotFoundException ex) {
            System.out.println("No address books stored");
        } catch (Exception e) {
            e.printStackTrace();
        }

       return ab;
    }
    

     
    
    

    
}
    
