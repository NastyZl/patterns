package org.example.task3;

public class Main {
    public static void main(String[] args) {
        Notifier sms = new SmsNotifier(new ConcreteNotifier(), NotificationMode.SMS_ONE.getMessage());
        sms.send();
        Notifier email = new EmailNotifier( new SmsNotifier( new ConcreteNotifier(), NotificationMode.SMS_TWO.getMessage()), NotificationMode.EMAIL_TWO.getMessage());
        email.send();
        Notifier smsAndEmail = new SmsNotifier(
                new SmsNotifier( new EmailNotifier( new ConcreteNotifier(), NotificationMode.SMS_ONE.getMessage()),
                        NotificationMode.SMS_TWO.getMessage()), NotificationMode.EMAIL_TWO.getMessage());
        smsAndEmail.send();
    }
}
