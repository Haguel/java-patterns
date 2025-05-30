package dev.haguel.patterns.decorator.pattern;

public class TextDecorator implements TextElement {
    protected final TextElement textElement;

    public TextDecorator(TextElement textElement) {
        this.textElement = textElement;
    }

    @Override
    public String render() {
        return textElement.render();
    }
}
