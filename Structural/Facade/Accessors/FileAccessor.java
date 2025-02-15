package Structural.Facade.Accessors;

import Structural.Facade.Database;
import Structural.Facade.File.FileReader;

public class FileAccessor implements Database {
    private final FileReader fileReader;

    public FileAccessor(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    @Override
    public void index() {
        this.fileReader.open();
        System.out.println("Reading from file: " + this.fileReader.read());
        this.fileReader.close();
    }

    @Override
    public void find() {
        this.fileReader.open();
        System.out.println("Reading from file: " + this.fileReader.read());
        this.fileReader.close();
    }

    @Override
    public void save() {
        this.fileReader.open();
        System.out.println("Writing in file");
        this.fileReader.close();
    }

    @Override
    public void update() {
        this.fileReader.open();
        System.out.println("Updating in file");
        this.fileReader.close();
    }

    @Override
    public void delete() {
        this.fileReader.open();
        System.out.println("Deleting in file");
        this.fileReader.close();
    }
}
