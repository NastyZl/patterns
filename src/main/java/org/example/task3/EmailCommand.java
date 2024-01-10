package org.example.task3;

public class EmailCommand implements Command {
    private TextNotification textNotification;

    public EmailCommand(TextNotification textNotification) {
        this.textNotification = textNotification;
    }

    @Override
    public void execute() {
        System.out.println(textNotification.email("*ссылка для скачивания анкеты*") + " " + textNotification.sms("проверьте почту."));
    }
}
