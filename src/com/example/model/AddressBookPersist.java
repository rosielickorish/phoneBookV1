package com.example.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AddressBookPersist {

    private List<Phonebook> addressBooks;

    public AddressBookPersist() {
        addressBooks = new ArrayList<Phonebook>();
        addressBooks = readAddressBooks(); // reads from previous runs      
    }

    public void addAddressBook(Phonebook addressbook) {
        if(!addressBooks.contains(addressbook)){
            addressBooks.add(addressbook);
            storeAddressBooks(addressBooks);
        }

    }

    public void removeAddressBook(Phonebook addressbook) {
        if(addressBooks.contains(addressbook)){
            addressBooks.remove(addressbook);
            storeAddressBooks(addressBooks);
        }

    }

    public List<Phonebook> getAddressBooks() {
        return addressBooks;
    }

    public void setAddressBooks(List<Phonebook> addressBooks) {
        this.addressBooks = addressBooks;
        storeAddressBooks(addressBooks);

    }   

    public void removeAllAddressBooks(){
        addressBooks.clear();
        storeAddressBooks(addressBooks);

    }   

    public void storeAddressBooks(List<Phonebook> addressBooks) {
        try {
            FileOutputStream fos = new FileOutputStream("AddressBooks.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(addressBooks);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

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



}