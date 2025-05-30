package dev.haguel.patterns.factory;

public class WordProcessor extends DocumentProcessor {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
