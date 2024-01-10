package org.example.task3;

public class SmsCommand implements Command {
    private TextNotification textNotification;

    public SmsCommand(TextNotification textNotification) {
        this.textNotification = textNotification;
    }

    @Override
    public void execute() {
        System.out.println(textNotification.sms("*ссылка для скачивания анкеты*"));
    }
}
