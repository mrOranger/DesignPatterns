package Behavioural.Command.Commands;

import Behavioural.Command.Document.Document;

public class LoadingCommand implements ClickCommand {
    private Document document;

    public LoadingCommand(Document document) {
        this.document = document;
    }

    @Override
    public void click() {
        this.document.startLoading();
        this.document.stopLoading();
    }
}
