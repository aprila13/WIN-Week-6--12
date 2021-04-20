package com.tts;
import java.lang.Math;

public class Calculator {
    public double Add(double num1, double num2){
        return num1 + num2;
    }
    public double Subtract(double num1, double num2){
        return num1 - num2;
    }
    public double Multiply(double num1, double num2){
        return num1 * num2;
    }
    public double Division(double num1, double num2){
        return num1 / num2;
    }
    public double Square(double num1){
        return num1 * num1;
    }
}
class MagicCalculator extends Calculator{
    public double SquareRoot(double num1){
        return Math.sqrt(num1);
    }
    public double Sin(double num1){
        return Math.sin(num1);
    }
    public double Cosine(double num1){
        return Math.cos(num1);
    }
    public double Tangent(double num1){
        return Math.tan(num1);
    }
    public double Factorial(double num1){
        double x = 1;
        for (int i = 2; i <= num1; i++) {
            x = x * i;
        }
        return x;
    }
}