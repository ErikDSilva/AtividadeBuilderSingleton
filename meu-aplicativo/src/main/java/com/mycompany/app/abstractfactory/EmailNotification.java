package com.mycompany.app.abstractfactory;

public class EmailNotification implements Notification {
    @Override
    public void enviar(String mensagem) {
        System.out.println(mensagem);
    }
}
