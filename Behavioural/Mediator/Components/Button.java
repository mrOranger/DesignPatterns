package Behavioural.Mediator.Components;

import Behavioural.Mediator.Mediators.UIDirector;

public class Button implements Component {
    private final String label;
    private boolean enabled;
    private final UIDirector director;

    public Button(String label, UIDirector director) {
        this.label = label;
        this.enabled = false;
        this.director = director;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void enable() {
        this.enabled = !this.enabled;
    }

    @Override
    public void onValueChange() {
        this.director.onComponentChange(this);
    }
}
