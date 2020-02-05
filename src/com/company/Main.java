package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hoi");

        double a = 33.3;
        double b = 66.6;
        double r = sum(a, b);
        System.out.println(a + " + " + b + " = " + r);

    }

    public static double sum(double a, double b){
        return a + b;
    }
}
