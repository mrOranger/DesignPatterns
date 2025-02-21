package Behavioural.Command.Components;

import Behavioural.Command.Commands.ClickCommand;

public class Button {
    private String label;
    private ClickCommand clickCommand;

    public Button(String label, ClickCommand clickCommand) {
        this.label = label;
        this.clickCommand = clickCommand;
    }

    public void setCommand(ClickCommand clickCommand) {
        this.clickCommand = clickCommand;
    }

    public void click() {
        this.clickCommand.click();
    }
}
