package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Documents.Concrete.PreCompiled.PreCompiledPrivacyPolicy;
import Creational.AbstractFactory.Documents.Concrete.PreCompiled.PreCompiledTaxDeclaration;
import Creational.AbstractFactory.Documents.PrivacyPolicy;
import Creational.AbstractFactory.Documents.TaxDeclaration;

public class PreCompiledDocumentFactory implements DocumentFactory {
    private final TaxDeclaration taxDeclaration;
    private final PrivacyPolicy privacyPolicy;

    public PreCompiledDocumentFactory() {
        this.taxDeclaration = new PreCompiledTaxDeclaration(
                new Float[]{10000.0f, 20000.0f, 30000.0f},
                new Float[]{1000.0f, 2000.0f, 3000.0f}
        );
        this.privacyPolicy = new PreCompiledPrivacyPolicy("John", "Doe");
    }

    public TaxDeclaration getTaxDeclaration() {
        return this.taxDeclaration;
    }

    public PrivacyPolicy getPrivacyPolicy() {
        return this.privacyPolicy;
    }
}
