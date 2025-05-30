### Assignment: Computer Configurator 🖥️

You're working for a company that sells custom-built PCs. A `Computer` is a complex object with many parts. Some parts are mandatory (like CPU and RAM), while others are optional (like a graphics card or a sound card). Using a standard constructor would be messy and inflexible.

This is a perfect use case for the **Builder** pattern.

**Your Task:**

1.  Create a `Computer` class. This will be the product. It should have fields for `CPU`, `RAM`, `storage`, and optional fields like `graphicsCard` and `soundCard`. The constructor of the `Computer` class should be `private`.

2.  Create a static nested `Builder` class inside the `Computer` class.

3.  The `Builder`'s constructor should accept the **mandatory** parameters: `CPU` and `RAM` (e.g., as `String` values).

4.  The `Builder` should have methods for setting the **optional** parts: `withGraphicsCard(String card)` and `withSoundCard(String card)`. These methods must return the `Builder` instance to allow for method chaining.

5.  The `Builder` must have a `build()` method that creates and returns a `Computer` instance.

6.  In your `Main` class, use your `Computer.Builder` to create at least two different computer configurations:
    * A basic office PC with only CPU and RAM.
    * A powerful gaming PC with a dedicated graphics card and a sound card.
    * Print the configurations to the console to verify the result.

### Solution Template

Your `Computer.java` file with the nested Builder:

~~~java
// Computer.java
public class Computer {
    // Fields for CPU, RAM, storage, graphicsCard, etc.

    // Private constructor that takes a Builder

    // An appropriate toString() method to display the configuration

    // Static nested Builder class
    public static class Builder {
        // Mandatory fields

        // Optional fields

        // Builder constructor for mandatory fields

        // Methods for optional fields (e.g., withGraphicsCard)

        // build() method
    }
}
~~~

Your `Main.java` file for demonstration:

~~~java
// Main.java
public class Main {
    public static void main(String[] args) {
        // Use the builder to create different computer configurations and print them
    }
}
~~~