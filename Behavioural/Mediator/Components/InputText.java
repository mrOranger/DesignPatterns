package Behavioural.Mediator.Components;

import Behavioural.Mediator.Mediators.UIDirector;

public class InputText implements Component {
    private String text;
    private final UIDirector director;

    public InputText(String text, UIDirector director) {
        this.text = text;
        this.director = director;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void onValueChange() {
        this.director.onComponentChange(this);
    }
}
