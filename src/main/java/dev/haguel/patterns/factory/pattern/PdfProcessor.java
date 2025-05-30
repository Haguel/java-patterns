package dev.haguel.patterns.factory.pattern;

public class PdfProcessor extends DocumentProcessor {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
