### Assignment: Online Store Product Availability 🛒

You are building a feature for an online store. Customers want to be notified when a popular product that is currently "out of stock" becomes available again.

This is a perfect use case for the **Observer** pattern. The `Product` will be the **Subject**, and interested `Customer`s will be the **Observers**.

**Your Task:**

1.  Define a `Subject` interface with methods to `registerObserver`, `removeObserver`, and `notifyObservers`.
2.  Define an `Observer` interface with a single `update(String message)` method.

3.  Create a concrete `Product` class that implements `Subject`.
    * It should have a name (e.g., "Gaming Laptop") and an availability status (e.g., a boolean `inStock`).
    * When the product's availability changes (e.g., through a method like `setInStock(boolean status)`), it should notify all its registered observers if the product is back in stock.

4.  Create a concrete `Customer` class that implements `Observer`.
    * It should have a customer name.
    * The `update` method should print a personalized notification to the console, for example: "Hello, [Customer Name]! The product [Product Name] is now back in stock."

5.  In your `Main` class, simulate the scenario:
    * Create a `Product` instance (e.g., "PlayStation 5") and set its status to out of stock.
    * Create several `Customer` instances.
    * Register these customers as observers for the product.
    * Change the product's status to "in stock". All registered customers should receive a notification.
    * Unregister one customer and change the status again (e.g., to out of stock, then back in stock) to show they no longer receive notifications.

### Solution Template

Your interfaces:

~~~java
// Observer.java (interface)

// Subject.java (interface)
~~~

Your concrete classes:

~~~java
// Product.java (concrete subject)

// Customer.java (concrete observer)
~~~

Your `Main.java` file for demonstration:

~~~java
// Main.java
public class Main {
    public static void main(String[] args) {
        // Demonstrate the notification system here
    }
}
~~~