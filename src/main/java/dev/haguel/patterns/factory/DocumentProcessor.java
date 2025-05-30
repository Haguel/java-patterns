package dev.haguel.patterns.factory;

public abstract class DocumentProcessor {
    public void processDocument() {
        Document document = createDocument();

        document.open();
        document.save();
    }

    public abstract Document createDocument();
}
