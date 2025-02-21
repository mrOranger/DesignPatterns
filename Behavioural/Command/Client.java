package Behavioural.Command;

import Behavioural.Command.Commands.CloseCommand;
import Behavioural.Command.Commands.HttpCommand;
import Behavioural.Command.Commands.LoadingCommand;
import Behavioural.Command.Components.Button;
import Behavioural.Command.Document.Document;

public class Client {
    public static void main(String[] args) {
        final var document = new Document("My Awesome SPA");
        final var closeCommand = new CloseCommand(document);
        final var httpCommand = new HttpCommand();
        final var loadingCommand = new LoadingCommand(document);
        final var button = new Button("Close", closeCommand);

        button.click();

        button.setCommand(loadingCommand);

        button.click();

        button.setCommand(httpCommand);

        button.click();
    }
}
