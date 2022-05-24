package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class EditContact {
    ArrayList<EditContact> contactList=new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int count=0;

    void getcontct()
    {
        EditContact person = new EditContact();

        System.out.println("enter first name");
        person.setfname(input.next());

        System.out.println("enter last name");
        person.setlname(input.next());

        System.out.println("enter city");
        person.setcity(input.next());

        System.out.println("enter phonenumber");
        person.setphonenumber(input.next());

        System.out.println("enter state");
        person.setstate(input.next());


        System.out.println("enter Address");
        person.setAddress(input.next());



        contactList.add(person);
        System.out.println();
        System.out.println("contact added");
        count++;

        System.out.println("size: "+contactList.size());
    }
    private void setAddress(String next) {
        // TODO Auto-generated method stub
    }
    private void setstate(String next) {
        // TODO Auto-generated method stub
    }
    private void setphonenumber(String next) {
        // TODO Auto-generated method stub
    }
    private void setcity(String next) {
        // TODO Auto-generated method stub
    }
    private void setlname(String next) {
        // TODO Auto-generated method stub
    }
    private void setfname(String next) {
        // TODO Auto-generated method stub
    }
}




