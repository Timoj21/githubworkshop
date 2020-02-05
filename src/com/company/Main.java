package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hoi");

        double a = 33.3;
        double b = 66.6;
        double r = sum(a, b);
        double r2 = multiply(a, b);
        System.out.println(a + " + " + b + " = " + r);
        System.out.println(a + " * " + b + " = " + r2);
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }


}
