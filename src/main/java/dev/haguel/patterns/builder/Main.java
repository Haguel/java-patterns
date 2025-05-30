package dev.haguel.patterns.builder;

import dev.haguel.patterns.builder.pattern.Computer;

public class Main {
    public static void main(String[] args) {
        Computer officePC = new Computer.Builder("Intel i3", "8GB", "256GB SSD")
                .build();
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
                .graphicsCard("NVIDIA RTX 3080")
                .soundCard("Creative Sound Blaster")
                .build();

        System.out.println("Office PC Configuration: " + officePC);
        System.out.println("Gaming PC Configuration: " + gamingPC);
    }
}
