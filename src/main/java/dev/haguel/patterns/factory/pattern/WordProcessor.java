package dev.haguel.patterns.factory.pattern;

public class WordProcessor extends DocumentProcessor {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
