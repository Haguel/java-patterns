package dev.haguel.patterns.strategy;

import dev.haguel.patterns.strategy.pattern.CreditCardPayment;
import dev.haguel.patterns.strategy.pattern.PayPalPayment;
import dev.haguel.patterns.strategy.pattern.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStrategy(new CreditCardPayment());
        shoppingCart.setAmount(100);
        shoppingCart.checkout();

        shoppingCart.setPaymentStrategy(new PayPalPayment());
        shoppingCart.setAmount(50);
        shoppingCart.checkout();
    }
}
