package Contacts;

import java.util.Scanner;

public class Ps {
    static int count = 0;

    public static void addContacts(String name, long number, En[] contacts) {
        if (count < contacts.length) {
            En contact = new En();
            contact.setName(name);
            contact.setNumber(number);
            contacts[count] = contact;
            count++;
        } else {
            System.out.println("Contacts list is full.");
        }

    }

    public static void getAllContacts(En[] contacts) {
        for (En c : contacts) {
            System.out.println(c);
        }
    }

    public static void main(String args[]) {
        En[] contacts = new En[12];
        int n = 0;
        while (n != 3) {
            System.out.println("Enter 1 for Add Contacts");
            System.out.println("Enter 2 for print Contacts");
            System.out.println("Enter 3 for Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("Enter Phone Number");
                long phoneNumber = sc.nextLong();
                sc.nextLine();
                System.out.println("Enter Contact Name");
                String ContactsName = sc.nextLine();
                addContacts(ContactsName, phoneNumber, contacts);

            } else if (n == 2) {
                getAllContacts(contacts);
            } else {
                return;
            }
        }

    }
}