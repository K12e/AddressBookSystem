package com.bridgelabz;

import java.security.KeyStore;
import java.util.*;

import static sun.security.util.Resources_fr.contents;

public class AddressBookMain {
    public static <T> void main(String[] args) {
        System.out.println("Welcome To Address Book");
        Contact contact=new Contact();
        contact.setFname("Kalyani");
        contact.setLname("Rathod");
        contact.setAddress("Raj Nagar");
        contact.setCity("pune");
        contact.setState("Maharastra");
        contact.setPhoneNumber("9586245695");

        Contact contact1=new Contact();
        contact1.setFname("Ayansh");
        contact1.setLname("Jadhao");
        contact1.setAddress("gandhi nagar");
        contact1.setCity("mumbai");
        contact1.setPhoneNumber("7545623515");
        contact1.setState("Maharasta");
        System.out.println(contact1.toString());

        System.out.println(contact.toString());

        T contents = null;
        List<Map.Entry> to_sort = new ArrayList<Map.Entry>((Collection<? extends Map.Entry>) Arrays.asList(contents));
        Collections.sort(to_sort, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return 0;
            }

            public int compare(Entry one, Entry other) {
                return one.[whatever is at n].compareTo(other.[whatever is at n]);
            }
        });

    }

    public void setState(String next) {
    }

    public void setCity(String next) {
    }

    public void setAddress(String next) {
    }

    public void setPhonenumber(long nextLong) {
    }

    public void setLname(String next) {
    }

    public void setfname(String next) {
    }

    public Object getFname() {
        return true;
    }

    public void setPhoneno(long nextLong) {
    }

    public void setFname(String name) {
    }

    public String getAddress() {
        return null;
    }

    public String getLname() {
        return null;
    }

    public String getPhonenumber() {
        return null;
    }

    public String getCity() {
        return null;
    }

    public String getState() {
        return null;
    }
}
