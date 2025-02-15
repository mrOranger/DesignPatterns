package Structural.Facade.File;

public class FileReader {
    public String fileContent;
    public boolean isOpen;

    public FileReader() {
        this.fileContent = new String();
        this.isOpen = false;
    }

    public void open() {
        if (!this.isOpen) {
            this.isOpen = true;
        }
    }

    public String read() {
        return this.fileContent;
    }

    public void write(String stringToWrite) {
        this.fileContent = this.fileContent.concat(stringToWrite);
    }

    public void close() {
        if (this.isOpen) {
            this.isOpen = false;
        }
    }
}
