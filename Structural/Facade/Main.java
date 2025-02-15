package Structural.Facade;

import Structural.Facade.Accessors.FileAccessor;
import Structural.Facade.Accessors.MySQLAccessor;
import Structural.Facade.Accessors.OracleAccessor;
import Structural.Facade.Databases.MySQL;
import Structural.Facade.Databases.Oracle;
import Structural.Facade.File.FileReader;

public class Main {
    public static void main(String[] args) {
        var database = Main.file();
        database.index();
        database.find();
        database.update();
        database.index();

        database = Main.mySQL();
        database.index();
        database.find();
        database.update();
        database.index();

        database = Main.oracle();
        database.index();
        database.find();
        database.update();
        database.index();

    }

    public static Database file() {
        return new FileAccessor(new FileReader());
    }

    public static Database oracle() {
        return new OracleAccessor(new Oracle());
    }

    public static Database mySQL() {
        return new MySQLAccessor(new MySQL());
    }
}
