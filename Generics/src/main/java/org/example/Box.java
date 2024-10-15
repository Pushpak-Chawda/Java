package org.example;

public class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }



    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
