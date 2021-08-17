package com.jill;

public class Main {

    public static void main(String[] args) {

        double pi = 3.142;
        double radius;

        radius = Input.getDouble("Enter the radius: ");
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + (2 * pi * radius));
        System.out.println("Area: " + (pi * radius * radius));
        System.out.println("Volume: " + ( 4.0 / 3.0 ) * pi * Math.pow( radius, 3 ));

    }
}
