package org.example.task3;

public class SmsNotifier extends NotifierDecorator {
    private final String message;

    public SmsNotifier(Notifier notifier, String message) {
        super(notifier);
        this.message = message;
    }

    @Override
    public void send(){
        super.send();
        sendSMS();
    }

    private void sendSMS() {
        System.out.println("**SMS** " + message);
    }
}
