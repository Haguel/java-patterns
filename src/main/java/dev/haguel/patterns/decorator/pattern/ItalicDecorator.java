package dev.haguel.patterns.decorator.pattern;

public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(TextElement textElement) {
        super(textElement);
    }

    @Override
    public String render() {
        return "<i>" + textElement.render() + "</i>";
    }
}
