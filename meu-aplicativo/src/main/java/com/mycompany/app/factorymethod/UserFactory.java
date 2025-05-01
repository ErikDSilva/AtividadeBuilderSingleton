package com.mycompany.app.factorymethod;

public class UserFactory {
    public static User createUser(String type) {
        if (type.equalsIgnoreCase("admin")) {
            return new Admin();
        } else if (type.equalsIgnoreCase("editor")) {
            return new Editor();
        } else if (type.equalsIgnoreCase("viewer")) {
            return new Viewer();
        } else {
            throw new IllegalArgumentException("Tipo de usuario inexistente: " + type);
        }
    }
}
