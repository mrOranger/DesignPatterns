package Behavioural.State.Notifications;

import Behavioural.State.Users.User;

public class NotificationService {
    public static void send(User user, String text) {
        final var stringBuilder = new StringBuilder()
                .append("[").append(user.getFirstName()).append(user.getLastName()).append("]")
                .append(" ").append(text)
                .toString();

        System.out.println(stringBuilder);
    }
}
