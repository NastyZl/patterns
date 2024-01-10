package org.example.task3;

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        invoker.executeOperation(new EmailCommand(new TextNotification()));
        invoker.executeOperation(new SmsCommand(new TextNotification()));

        invoker.getCommands();
    }
}
