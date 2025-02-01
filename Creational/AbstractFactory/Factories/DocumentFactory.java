package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Documents.PrivacyPolicy;
import Creational.AbstractFactory.Documents.TaxDeclaration;

public interface DocumentFactory {
    TaxDeclaration getTaxDeclaration();
    PrivacyPolicy getPrivacyPolicy();
}
