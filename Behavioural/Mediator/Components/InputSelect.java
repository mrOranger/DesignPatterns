package Behavioural.Mediator.Components;

import Behavioural.Mediator.Mediators.UIDirector;

import java.util.Arrays;

public class InputSelect implements Component {
    private String selection;
    private final String[] options;
    private final UIDirector director;

    public InputSelect(String[] options, UIDirector director) {
        this.selection = null;
        this.options = options;
        this.director = director;
    }

    public void select(String option) {
        final var selection = Arrays.stream(this.options).filter((value) -> value.equals(option)).findFirst();
        selection.ifPresent(s -> this.selection = s);
    }

    public String getSelection() {
        return this.selection;
    }

    @Override
    public void onValueChange() {
        this.director.onComponentChange(this);
    }
}
