package Behavioural.Observer.Observers;

import Behavioural.Observer.Notifications.Email;

public class UserObserver implements Observer<Email> {

    @Override
    public void update(Email message) {
        final var stringBuilder = new StringBuilder();
        stringBuilder.append("---------------------").append('\n');;
        stringBuilder.append("Subject: ").append(message.getSubject()).append('\n');
        stringBuilder.append("Text: ").append(message.getText()).append('\n');
        stringBuilder.append("---------------------").append('\n');;
        System.out.println(stringBuilder);
    }
}
