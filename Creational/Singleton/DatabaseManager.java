package Creational.Singleton;

public class DatabaseManager {

    private static DatabaseManager instance = null;
    private String connectionString;

    private DatabaseManager() {
        this.connectionString = "Secret.Connection.String";
    }

    public static DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    public String getConnectionString() {
        return connectionString;
    }

    @Override
    public String toString() {
        return "DatabaseManager{" +
                "hashCode='" + super.hashCode() + '\'' +
                ", connectionString='" + connectionString + '\'' +
                '}';
    }
}
