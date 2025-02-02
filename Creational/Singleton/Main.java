package Creational.Singleton;

public class Main {
    public static void main (String[] args) {
        final DatabaseManager databaseManager = DatabaseManager.getInstance();
        System.out.println(databaseManager);
        final DatabaseManager anotherManager = DatabaseManager.getInstance();
        System.out.println(anotherManager);
    }
}
