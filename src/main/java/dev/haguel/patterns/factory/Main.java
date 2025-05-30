package dev.haguel.patterns.factory;

public class Main {
    private static DocumentProcessor getDocumentProcessorByType(String type) {
        if(type.equals("word")) {
            return new WordProcessor();
        } else if(type.equals("pdf")) {
            return new PdfProcessor();
        } else {
            throw new RuntimeException("Invalid document type");
        }
    }

    public static void main(String[] args) {
        DocumentProcessor documentProcessor;

        documentProcessor = getDocumentProcessorByType("word");
        documentProcessor.processDocument();

        documentProcessor = getDocumentProcessorByType("pdf");
        documentProcessor.processDocument();
    }
}
