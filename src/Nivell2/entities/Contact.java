package Nivell2.entities;

public class Contact {

    private final String name;
    private final String phone;
    private final String address;

    public Contact(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nContact name:\n\t" + name + "\nContact phone:\n\t" + phone + "\nContact address:\n\t" + address;
    }
}
