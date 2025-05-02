package com.mycompany.app;

import com.mycompany.app.abstractfactory.EmailNotificationFactory;
import com.mycompany.app.abstractfactory.Notification;
import com.mycompany.app.abstractfactory.NotificationFactory;
import com.mycompany.app.factorymethod.User;
import com.mycompany.app.factorymethod.UserFactory;
import com.mycompany.app.singleton.ConfigManager;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
        // Singleton
        System.out.println(">> Singleton <<");
        ConfigManager config1 = ConfigManager.getInstance();
        ConfigManager config2 = ConfigManager.getInstance();

        config1.setConfig("PT-BR", "Claro", false);
        System.out.println(config1);
        System.out.println(config2);


        // Factory Method
        System.out.println("\n\n>> Factory Method <<");
        User user1 = UserFactory.createUser("admin");
        user1.paint();

        User user2= UserFactory.createUser("editor");
        user2.paint();

        User user3 = UserFactory.createUser("viewer");
        user3.paint();

        // Abstract Factory
        System.out.println("\n\n>> Abstract Factory <<");

        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification email = emailFactory.criarNotificacao();

        email.enviar("Mensagem enviada com sucesso!");
        

    }
}
