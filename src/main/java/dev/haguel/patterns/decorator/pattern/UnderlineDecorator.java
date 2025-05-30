package dev.haguel.patterns.decorator.pattern;

public class UnderlineDecorator extends TextDecorator {
    public UnderlineDecorator(TextElement textElement) {
        super(textElement);
    }

    @Override
    public String render() {
        return "<u>" + textElement.render() + "</u>";
    }
}
