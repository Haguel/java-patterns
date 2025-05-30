package dev.haguel.patterns.observer;

import dev.haguel.patterns.observer.pattern.Customer;
import dev.haguel.patterns.observer.pattern.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("PlayStation 5");

        Customer customer1 = new Customer("Alex");
        Customer customer2 = new Customer("Fred");
        Customer customer3 = new Customer("John");

        product.registerObserver(customer1);
        product.registerObserver(customer2);
        product.registerObserver(customer3);

        product.setAvailable(false);

        product.removeObserver(customer1);

        product.setAvailable(true);
    }
}
