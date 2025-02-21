package Behavioural.Command.Commands;

import Behavioural.Command.Document.Document;

public class CloseCommand implements ClickCommand {
    private Document document;

    public CloseCommand(Document document) {
        this.document = document;
    }

    @Override
    public void click() {
        this.document.close();
    }
}
