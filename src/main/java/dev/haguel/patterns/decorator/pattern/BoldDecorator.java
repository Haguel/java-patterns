package dev.haguel.patterns.decorator.pattern;

public class BoldDecorator extends TextDecorator {
    public BoldDecorator(TextElement textElement) {
        super(textElement);
    }

    @Override
    public String render() {
        return "<b>" + textElement.render() + "</b>";
    }
}
