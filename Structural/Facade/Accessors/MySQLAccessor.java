package Structural.Facade.Accessors;

import Structural.Facade.Database;
import Structural.Facade.Databases.MySQL;

public class MySQLAccessor implements Database {
    private final MySQL mySQL;

    public MySQLAccessor(MySQL mySQL) {
        this.mySQL = mySQL;
    }

    @Override
    public void index() {
        this.mySQL.startTransaction();
        System.out.println("Reading from MYSQL Database");
        this.mySQL.closeTransaction();
    }

    @Override
    public void find() {
        this.mySQL.startTransaction();
        System.out.println("Finding from MYSQL Database");
        this.mySQL.closeTransaction();
    }

    @Override
    public void save() {
        this.mySQL.startTransaction();
        System.out.println("Saving from MYSQL Database");
        this.mySQL.closeTransaction();
    }

    @Override
    public void update() {
        this.mySQL.startTransaction();
        System.out.println("Updating from MYSQL Database");
        this.mySQL.closeTransaction();
    }

    @Override
    public void delete() {
        this.mySQL.startTransaction();
        System.out.println("Deleting from MYSQL Database");
        this.mySQL.closeTransaction();
    }
}
