package dev.haguel.patterns.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String name;
    private boolean isAvailable;
    private List<Observer> observers;

    public Product(String name, boolean isAvailable, List<Observer> observers) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.observers = observers;
    }

    public Product(String name, boolean isAvailable) {
        this.name = name;
        this.isAvailable = isAvailable;
        this.observers = new ArrayList<>();
    }

    public Product(String name) {
        this.name = name;
        this.isAvailable = true;
        this.observers = new ArrayList<>();
    }

    public void setAvailable(boolean available) {
        isAvailable = available;

        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> {
            String message = isAvailable
                    ? "The product " + name + " is now back in stock."
                    : "The product " + name + " is now unavailable.";
            o.update(message);
        });
    }
}
