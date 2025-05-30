### Assignment: The Centralized Logger 📝

Imagine you are building an application that needs a logging service. It's crucial that all parts of the application write logs to the **same place** and in the correct order. A Singleton is the perfect pattern for this.

**Your Task:**

Create a `Logger` class that implements the Singleton pattern.

1.  The `Logger` class must ensure only one instance of itself can be created.
2.  It should have a private field, for example, `List<String> logs`, to store log messages.
3.  Implement a public method `log(String message)`. This method should add the given message to the `logs` list, preferably with a timestamp.
4.  Implement a public method `showLogs()` that prints all the collected logs to the console.
5.  In your `Main` class, demonstrate how it works:
    * Get the logger instance in one part of your code (e.g., `Logger logger1 = Logger.getInstance();`).
    * Add a few log messages.
    * Get the logger instance again in another part of your code (e.g., `Logger logger2 = Logger.getInstance();`).
    * Add more log messages.
    * Finally, call `showLogs()` from either `logger1` or `logger2` to prove that all messages from all parts of your code were collected by the *single* logger instance.

### Solution Template

Your `Logger.java` file:

~~~java
// Your Logger class implementation here
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

}
~~~

Your `Main.java` file for demonstration:

~~~java
// Your Main class implementation here
public class Main {
    public static void main(String[] args) {
        // Demonstrate your logger here
    }
}
~~~