package dev.haguel.patterns.strategy.pattern;

public class ShoppingCart {
    private int amount;
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void checkout() {
        paymentStrategy.pay(amount);
    }
}
