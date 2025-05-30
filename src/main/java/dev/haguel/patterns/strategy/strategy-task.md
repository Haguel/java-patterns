### Assignment: Payment Processing System 💳

You are developing an e-commerce checkout system. Customers should be able to pay using different methods, such as a Credit Card or PayPal. Each payment method has its own specific process (e.g., collecting card details vs. redirecting to a login page).

Your task is to implement this functionality using the **Strategy** pattern, so that new payment methods can be added easily in the future without changing the core checkout logic.

**Your Task:**

1.  Create a `PaymentStrategy` interface. It should declare a method, for example, `pay(int amount)`.

2.  Create concrete strategy classes that implement `PaymentStrategy`: `CreditCardPayment` and `PayPalPayment`. The `pay` method in each class should simply print a confirmation message to the console, like "Paying $" + amount + " using Credit Card."

3.  Create a context class named `ShoppingCart`. This class will have an amount (the total price of items) and will hold a reference to a `PaymentStrategy`.

4.  The `ShoppingCart` class should have a method like `setPaymentStrategy(PaymentStrategy strategy)` to allow the client to select a payment method.

5.  The `ShoppingCart` class should also have a `checkout()` method. This method will call the `pay` method on the currently selected payment strategy.

6.  In your `Main` class, simulate a shopping process:
    * Create an instance of `ShoppingCart`.
    * Set a total amount.
    * Let the "customer" pay first using a Credit Card.
    * Then, let the "customer" change their mind and pay using PayPal.
    * This will demonstrate that you can change the payment algorithm at runtime.

### Solution Template

Your strategy interface and concrete classes:

~~~java
// PaymentStrategy.java (interface)

// CreditCardPayment.java (concrete strategy)

// PayPalPayment.java (concrete strategy)
~~~

Your context class:

~~~java
// ShoppingCart.java (context)
public class ShoppingCart {
    // fields for amount and strategy

    // constructor to set the amount

    // method to set the strategy

    // method to execute the payment (checkout)
}
~~~

Your `Main.java` file for demonstration:

~~~java
// Main.java
public class Main {
    public static void main(String[] args) {
        // Demonstrate the payment process here
    }
}
~~~