package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Products.PrivacyPolicy;
import Creational.AbstractFactory.Products.TaxDeclaration;

public interface DocumentFactory {
    TaxDeclaration getTaxDeclaration();
    PrivacyPolicy getPrivacyPolicy();
}
