package dev.haguel.patterns.decorator.pattern;

public class PlaintText implements TextElement {
    private final String string;

    public PlaintText(String string) {
        this.string = string;
    }

    @Override
    public String render() {
        return string;
    }
}
