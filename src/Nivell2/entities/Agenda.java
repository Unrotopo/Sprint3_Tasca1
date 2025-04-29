package Nivell2.entities;

import Nivell2.exceptions.FactoryNotFoundException;
import Nivell2.factories.AbstractContactFactory;
import Nivell2.factories.ContactFactory;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private static List<Contact> contacts = new ArrayList<>();

    public void addContact(String country, String name, String phone, String address) {
        try {
            ContactFactory factory = AbstractContactFactory.getFactory(country);
            Contact contact = factory.createContact(name, phone, address);
            contacts.add(contact);
        } catch (FactoryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showContacts() {
        contacts.forEach(System.out::println);
    }
}
