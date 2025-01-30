package Creational.AbstractFactory;

import Creational.AbstractFactory.Factories.DocumentFactory;
import Creational.AbstractFactory.Factories.PreCompiledDocumentFactory;
import Creational.AbstractFactory.Factories.StaticDocumentFactory;

public class Main {
    public static void main(String[] args) {
        final DocumentFactory precompiledFactory = new PreCompiledDocumentFactory();
        final DocumentFactory staticFactory = new StaticDocumentFactory();

        Main.printDocuments(precompiledFactory);
        Main.downloadDocuments(precompiledFactory);

        Main.printDocuments(staticFactory);
        Main.downloadDocuments(staticFactory);
    }

    public static void printDocuments(DocumentFactory documentFactory) {
        documentFactory.getPrivacyPolicy().print();
        documentFactory.getTaxDeclaration().print();
    }

    public static void downloadDocuments(DocumentFactory documentFactory) {
        documentFactory.getPrivacyPolicy().download();
        documentFactory.getTaxDeclaration().download();
    }
}
