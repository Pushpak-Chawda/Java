package org.example;

public class Sum <T extends Number,U extends Number>{

    private T num1;
    private U num2;

    public Sum(T num1,U num2){
        this.num1=num1;
        this.num2=num2;
    }
    public double getSum(){
        return num1.doubleValue()+num2.doubleValue();
    }

}
