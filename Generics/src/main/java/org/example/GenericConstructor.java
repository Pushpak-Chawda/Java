package org.example;

public class GenericConstructor {
    private double value;

    public <T extends Number> GenericConstructor(T t) {
    this.value = t.doubleValue();
    }

    public double getValue() {
        return value;
    }
}
