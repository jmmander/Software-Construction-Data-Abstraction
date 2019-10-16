package ui;

import Model.Contact;

import java.util.Scanner;

import static Model.ContactType.FAMILY;
import static Model.ContactType.FRIEND;
import static Model.ContactType.WORK;

public class Main {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("To add a new contact, type in their name, then press 'enter':");
        String name = s.nextLine();
        // TODO: Create a Contact object "c' here with the name read from the scanner, you can read input from the scanner
        Contact c = new Contact(name, 0, FAMILY);
        // TODO: by calling next() on the scanner
        System.out.println("Add a phone number for " + c.getName() + ":");
        int number = s.nextInt();
        c.setNumber(number);

        System.out.println("Would you like to call " + c.getName() + " now? Type 'y' for yes, 'n' for no.");
        String option = s.next();
        if(option.equals("y")) {
            System.out.println("Enter a date for the call in the format MM/DD/YY:");
            c.call(s.next());
            System.out.println("Here is your updated call history:");
            System.out.println(c.getCallLog());
        } else if (option.equals("n")) {
            System.out.println("Call history: No Calls.");
            }
    }

    }



