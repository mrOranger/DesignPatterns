package Creational.AbstractFactory.Documents.Concrete.Static;

import Creational.AbstractFactory.Documents.TaxDeclaration;

public class StaticTaxDeclaration extends TaxDeclaration {
    public StaticTaxDeclaration(Float[] incomes, Float[] outcomes) {
        super(incomes, outcomes);
    }

    @Override
    public void print() {
        System.out.println(new StringBuilder()
                .append("[Printing] Static Tax Declaration")
                .append(" ")
                .append(this.computeTotalIncomes() + this.computeTotalOutcomes())
        );
    }

    @Override
    public void download() {
        System.out.println(new StringBuilder()
                .append("[Downloading] Static Tax Declaration")
                .append(" ")
                .append(this.computeTotalIncomes() + this.computeTotalOutcomes())
        );
    }
}
