package org.example.task3;

public enum NotificationMode {
    SMS_ONE("link to the questionnaire: 'http://*'."),
    EMAIL_TWO("the questionnaire is attached to the letter."),
    SMS_TWO("You have received a letter with a questionnaire! Check the email!"),
    ;
    private final String message;
    NotificationMode(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "NotificationMode{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }
}
