package Behavioural.Command.Commands;

public class HttpCommand implements ClickCommand {
    @Override
    public void click() {
        System.out.println("Making an HTTP call to the server ...");
    }
}
