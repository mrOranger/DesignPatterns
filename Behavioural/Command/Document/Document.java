package Behavioural.Command.Document;

public class Document {
    private String title;
    private boolean loading;

    public Document(String title) {
        this.title = title;
        this.loading = false;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public void startLoading() {
        this.loading = true;
        System.out.println("Starting loading ...");
    }

    public void stopLoading() {
        this.loading = false;
        System.out.println("Stopping loading ...");
    }

    public void close() {
        System.out.println("Document is closing ...");
    }
}
