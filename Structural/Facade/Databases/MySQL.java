package Structural.Facade.Databases;

import java.util.ArrayList;
import java.util.List;

public class MySQL {
    private List<String> databaseContent;
    private boolean transactionActive;

    public MySQL() {
        this.transactionActive = false;
        this.databaseContent = new ArrayList<>();
    }

    public void startTransaction() {
        if (!this.transactionActive) {
            this.transactionActive = true;
        }
    }

    public String select() {
        return this.databaseContent.stream()
                .reduce("", String::concat);
    }

    public void insert(String newContent) {
        this.databaseContent.add(newContent);
    }

    public void update(int index, String newString) {
        this.databaseContent.add(index, newString);
    }

    public void closeTransaction() {
        if (this.transactionActive) {
            this.transactionActive = false;
        }
    }
}
