package Creational.AbstractFactory.Documents;

import java.util.Arrays;

public abstract class TaxDeclaration {
    protected final Float[] incomes;
    protected final Float[] outcomes;

    public TaxDeclaration(Float[] incomes, Float[] outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public float computeTotalIncomes() {
        return Arrays.stream(this.incomes)
                .reduce(0f, Float::sum);
    }

    public float computeTotalOutcomes() {
        return Arrays.stream(this.incomes)
                .reduce(0f, Float::sum);
    }
    public abstract void print();
    public abstract void download();
}
