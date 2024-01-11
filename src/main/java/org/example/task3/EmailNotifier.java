package org.example.task3;

public class EmailNotifier extends NotifierDecorator {
    private final String message;

    public EmailNotifier(Notifier notifier, String message) {
        super(notifier);
        this.message = message;
    }

    @Override
    public void send(){
        super.send();
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("**Email** " + message);
    }
}
