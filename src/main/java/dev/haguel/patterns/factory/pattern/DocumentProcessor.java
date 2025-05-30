package dev.haguel.patterns.factory.pattern;

public abstract class DocumentProcessor {
    public void processDocument() {
        Document document = createDocument();

        document.open();
        document.save();
    }

    public abstract Document createDocument();
}
