package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hoi");

        double a = 33.3;
        double b = 66.6;
        double r = sum(a, b);
        System.out.println(a + " + " + b + " = " + r);

        double r2 = sub(a, b);
        System.out.println(a + " - " + b + " = " + r2);

        double r3 = multiply(a, b);
        System.out.println(a + " * " + b + " = " + r3);


    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static double sub(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }


}
