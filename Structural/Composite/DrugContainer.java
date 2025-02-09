package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class DrugContainer implements Box {
    private final List<Box> boxes;

    public DrugContainer() {
        this.boxes = new ArrayList<>();
    }

    public void addBox(Box box) {
        this.boxes.add(box);
    }

    @Override
    public float amount() {
        return this.boxes.stream()
                .reduce(0f, (acc, box) -> acc + box.amount(), Float::sum);
    }
}
