package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Products.Concrete.Static.StaticPrivacyPolicy;
import Creational.AbstractFactory.Products.Concrete.Static.StaticTaxDeclaration;
import Creational.AbstractFactory.Products.PrivacyPolicy;
import Creational.AbstractFactory.Products.TaxDeclaration;

public class StaticDocumentFactory implements DocumentFactory {
    private final TaxDeclaration taxDeclaration;
    private final PrivacyPolicy privacyPolicy;

    public StaticDocumentFactory() {
        this.taxDeclaration = new StaticTaxDeclaration(
                new Float[]{10000.0f, 20000.0f, 30000.0f},
                new Float[]{1000.0f, 2000.0f, 3000.0f}
        );
        this.privacyPolicy = new StaticPrivacyPolicy("John", "Doe");
    }

    public TaxDeclaration getTaxDeclaration() {
        return this.taxDeclaration;
    }

    public PrivacyPolicy getPrivacyPolicy() {
        return this.privacyPolicy;
    }
}
