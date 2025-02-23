package Behavioural.Mediator;

import Behavioural.Mediator.Components.Button;
import Behavioural.Mediator.Components.InputSelect;
import Behavioural.Mediator.Components.InputText;
import Behavioural.Mediator.Mediators.ComponentDirector;

public class Client {
    public static void main(String[] args) {
        final var director = new ComponentDirector();
        final var button = new Button("Button", director);
        final var inputText = new InputText("Username", director);
        final var inputSelect = new InputSelect(new String[]{"Mario", "Luigi"}, director);

        director.setButton(button);
        director.setInputText(inputText);
        director.setInputSelect(inputSelect);

        System.out.println("Input text: " + inputText.getText());
        System.out.println("Select text: " + inputSelect.getSelection());
        System.out.println("Is button enabled? " + button.isEnabled());

        inputText.setText("Mario");
        inputText.onValueChange();

        System.out.println("Input text: " + inputText.getText());
        System.out.println("Select text: " + inputSelect.getSelection());
        System.out.println("Is button enabled? " + button.isEnabled());
    }
}
