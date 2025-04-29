package Nivell2.factories;

import Nivell2.entities.Contact;

public class FrContactFactory implements ContactFactory {

    @Override
    public Contact createContact(String name, String phone, String address) {
        return new Contact(addName(name), addPhone(phone), addAddress(address));
    }

    @Override
    public String addName(String name) {
        return name;
    }

    @Override
    public String addPhone(String phone) {
        return "+33 " + phone;
    }

    @Override
    public String addAddress(String address) {
        return address + "\n\tFrance";
    }
}
