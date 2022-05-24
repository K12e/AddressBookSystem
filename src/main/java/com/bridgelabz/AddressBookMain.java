package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        Contact contact=new Contact();
        contact.setFname("Kalyani");
        contact.setLname("Rathod");
        contact.setAddress("Raj Nagar");
        contact.setCity("pune");
        contact.setState("Maharastra");
        contact.setPhoneNumber("9586245695");

        System.out.println(contact.toString());

    }
}
