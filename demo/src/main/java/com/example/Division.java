package com.example;

public class Division {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Тоог 0-д хуваах боломжгүй");
        }
        return a / b;
    }
}