package org.example.task3;

public class ConcreteNotifier implements Notifier{
    @Override
    public void send() {
        System.out.println("NEW NOTIFICATION:");
    }
}
