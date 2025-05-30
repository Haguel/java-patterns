package dev.haguel.patterns.factory;

public class PdfProcessor extends DocumentProcessor {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
