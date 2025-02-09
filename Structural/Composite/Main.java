package Structural.Composite;

public class Main {

    public static void main(String[] args) {
        final var firstPill = new Pill("Pill", "First", 20.0f);
        final var secondPill = new Pill("Pill", "Second", 5.25f);
        final var thirdPill = new Pill("Pill", "Third", 21.5f);
        final var fourthPill = new Pill("Pill", "Fourth", 1.5f);
        final var firstDrugContainer = new DrugContainer();
        final var secondDrugContaienr = new DrugContainer();

        firstDrugContainer.addBox(firstPill);
        firstDrugContainer.addBox(secondPill);
        firstDrugContainer.addBox(fourthPill);

        secondDrugContaienr.addBox(firstDrugContainer);
        secondDrugContaienr.addBox(thirdPill);

        System.out.println("Total cost of first drug container: " + firstDrugContainer.amount());
        System.out.println("Total cost of second drug container: " + secondDrugContaienr.amount());

    }

}
