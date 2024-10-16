package org.example;

public class Square {

    public <T extends Number, U extends Number> double getMean(T num1, U num2){
        return (num1.doubleValue() + num2.doubleValue())/2;
    }

}
