package Nivell2.factories;

import Nivell2.exceptions.FactoryNotFoundException;

public class AbstractContactFactory {

    public static ContactFactory getFactory(String country) {
        return switch (country) {
            case "ES" -> new SpContactFactory();
            case "FR" -> new FrContactFactory();
            case "UK" -> new UkContactFactory();
            case null, default -> throw new FactoryNotFoundException("Factory not found");
        };
    }
}
