package org.example.task3;

public abstract class NotifierDecorator implements Notifier {
    private final Notifier wrapped;

    public NotifierDecorator(Notifier notifier) {
        wrapped = notifier;
    }
    @Override
    public void send() {
        wrapped.send();
    }
}
