package Behavioural.Mediator.Mediators;

import Behavioural.Mediator.Components.Button;
import Behavioural.Mediator.Components.Component;
import Behavioural.Mediator.Components.InputSelect;
import Behavioural.Mediator.Components.InputText;

public class ComponentDirector implements UIDirector {
    private Component button;
    private Component inputText;
    private Component inputSelect;

    public void setButton(Component button) {
        this.button = button;
    }

    public void setInputText(Component inputText) {
        this.inputText = inputText;
    }

    public void setInputSelect(Component inputSelect) {
        this.inputSelect = inputSelect;
    }

    @Override
    public void onComponentChange(Component component) {
        if (component instanceof InputSelect) {
            ((InputText)this.inputText).setText(((InputSelect)component).getSelection());
            ((Button)this.button).enable();
            return;
        }

        if (component instanceof InputText) {
            ((InputSelect)this.inputSelect).select(((InputText)this.inputText).getText());
            ((Button)this.button).enable();
        }
    }
}
