package dev.haguel.patterns.decorator;

import dev.haguel.patterns.decorator.pattern.*;

public class Main {
    public static void main(String[] args) {
        TextElement text1 = new PlaintText("Hello World!");
        text1 = new BoldDecorator(text1);
        text1 = new ItalicDecorator(text1);

        System.out.println(text1.render());

        TextElement text2 = new PlaintText("Happy programming!");
        text2 = new UnderlineDecorator(text2);
        text2 = new BoldDecorator(text2);

        System.out.println(text2.render());
    }
}
