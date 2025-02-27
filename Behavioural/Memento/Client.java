package Behavioural.Memento;

public class Client {
    public static void main(String[] args) {
        final var user = new User("1", "Mario", "Rossi");
        final var userHistory = new UserHistory();
        userHistory.save(user.save());
        user.setLastName("Neri");
        userHistory.save(user.save());
        user.setFirstName("Francesco");
        System.out.println(user.toString());
        user.restore(userHistory.get());
        System.out.println(user.toString());
        user.restore(userHistory.get());
        System.out.println(user.toString());
        user.restore(userHistory.get());
    }
}
