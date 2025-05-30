### Assignment: Text Formatting System ✍️

You are building a simple text processor. You have a basic `Text` object that holds a plain string, but you want to add formatting options like **bold**, *italic*, and _underline_. You want to be able to combine these formats, for example, making text that is both bold and italic.

The **Decorator** pattern is ideal for this, as it allows you to "wrap" a piece of text with different formatting layers.

**Your Task:**

1.  Create a `TextElement` interface with a single method: `render()`, which returns a `String`.

2.  Create a concrete component class `PlainText` that implements `TextElement`. Its `render()` method should simply return the original text string it holds.

3.  Create an abstract base decorator `TextDecorator` that also implements the `TextElement` interface. It should hold a reference to a wrapped `TextElement` object.

4.  Create concrete decorator classes: `BoldDecorator`, `ItalicDecorator`, and `UnderlineDecorator`. Each should extend `TextDecorator`. Their `render()` methods should call the `render()` method of the wrapped object and then add the appropriate formatting tags (e.g., `<b>...</b>` for bold, `<i>...</i>` for italic).

5.  In your `Main` class, demonstrate the system:
    * Create a `PlainText` object.
    * Decorate it to make it bold.
    * Decorate it further to make it both bold and italic.
    * Create another text object that is underlined and italic.
    * Print the results of the `render()` calls to see the nested formatting.

### Solution Template

Your component interface and concrete component:

~~~java
// TextElement.java (interface)

// PlainText.java (concrete component)
~~~

Your abstract and concrete decorators:

~~~java
// TextDecorator.java (abstract decorator)

// BoldDecorator.java (concrete decorator)

// ItalicDecorator.java (concrete decorator)

// UnderlineDecorator.java (concrete decorator)
~~~

Your `Main.java` file for demonstration:

~~~java
// Main.java
public class Main {
    public static void main(String[] args) {
        // Demonstrate the text formatting system here
        // Example: new BoldDecorator(new ItalicDecorator(new PlainText("Hello World")));
    }
}
~~~