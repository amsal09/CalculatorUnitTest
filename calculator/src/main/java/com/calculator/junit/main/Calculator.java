package com.calculator.junit.main;

public class Calculator {

    public float Addition(float number1, float number2){
        return number1 +number2;
    }
    public float Substaction(float number1, float number2){
        return number1-number2;
    }
    public float Multiplication(float number1, float number2){
        return number1*number2;
    }
    public float Division(float number1, float number2){
        return number1/number2;
    }
    public double Square(float number){
        return Math.sqrt(number);
    }
    public double Percent(double number){
        return number/100;
    }
}
