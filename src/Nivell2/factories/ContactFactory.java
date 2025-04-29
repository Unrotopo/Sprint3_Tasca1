package Nivell2.factories;

import Nivell2.entities.Contact;

public interface ContactFactory {

    String addName(String name);
    String addPhone(String phone);
    String addAddress(String address);

    Contact createContact(String name, String phone, String address);
}
