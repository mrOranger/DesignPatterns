package Structural.Facade.Accessors;

import Structural.Facade.Database;
import Structural.Facade.Databases.Oracle;

public class OracleAccessor implements Database {
    private final Oracle oracle;

    public OracleAccessor(Oracle oracle) {
        this.oracle = oracle;
    }

    @Override
    public void index() {
        this.oracle.startTransaction();
        System.out.println("Reading from Oracle Database");
        this.oracle.closeTransaction();
    }

    @Override
    public void find() {
        this.oracle.startTransaction();
        System.out.println("Finding from Oracle Database");
        this.oracle.closeTransaction();
    }

    @Override
    public void save() {
        this.oracle.startTransaction();
        System.out.println("Saving from Oracle Database");
        this.oracle.closeTransaction();
    }

    @Override
    public void update() {
        this.oracle.startTransaction();
        System.out.println("Updating from Oracle Database");
        this.oracle.closeTransaction();
    }

    @Override
    public void delete() {
        this.oracle.startTransaction();
        System.out.println("Deleting from Oracle Database");
        this.oracle.closeTransaction();
    }
}
