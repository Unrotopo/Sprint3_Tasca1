package Nivell2;

import Nivell2.entities.Agenda;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.addContact("ES", "Manolo Flores", "546375214", "Bonifacio 12");
        agenda.addContact("UK", "Mathew McMathew", "459248532", "Queen Abby 43");
        agenda.addContact("FR", "Josephine Lacan", "456234672", "Libertè 69");

        agenda.showContacts();
    }
}
