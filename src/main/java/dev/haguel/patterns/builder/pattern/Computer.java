package dev.haguel.patterns.builder.pattern;

public class Computer {
    private final String CPU;
    private final String RAM;
    private final String storage;
    private String soundCard;
    private String graphicsCard;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.soundCard = builder.soundCard;
        this.graphicsCard = builder.graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", soundCard='" + soundCard + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }

    public static class Builder {
        private final String CPU;
        private final String RAM;
        private final String storage;
        private String soundCard = "None";
        private String graphicsCard = "None";

        public Builder(String CPU, String RAM, String storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        public Builder soundCard(String value) {
            this.soundCard = value;

            return this;
        }

        public Builder graphicsCard(String value) {
            this.graphicsCard = value;

            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
