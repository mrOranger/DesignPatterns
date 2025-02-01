package Creational.AbstractFactory.Documents.Concrete.PreCompiled;

import Creational.AbstractFactory.Documents.TaxDeclaration;

public class PreCompiledTaxDeclaration extends TaxDeclaration {
    public PreCompiledTaxDeclaration(Float[] incomes, Float[] outcomes) {
        super(incomes, outcomes);
    }

    @Override
    public void print() {
        System.out.println(new StringBuilder()
                .append("[Printing] Precompiled Tax Declaration")
                .append(" ")
                .append(this.computeTotalIncomes() + this.computeTotalOutcomes())
        );
    }

    @Override
    public void download() {
        System.out.println(new StringBuilder()
                .append("[Downloading] Precompiled Tax Declaration")
                .append(" ")
                .append(this.computeTotalIncomes() + this.computeTotalOutcomes())
        );
    }
}
