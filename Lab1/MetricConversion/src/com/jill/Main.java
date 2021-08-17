package com.jill;

public class Main {

    public static void main(String[] args) {

        Integer feet;
        Integer inches;
        Integer meters;
        Integer centimeters;
        Double doubleCentimeters;

        final Double CENTIMETERS_PER_INCH = 2.54;
        final Integer  INCHES_PER_FOOT = 12;

        feet = Input.getInteger("Feet: ");
        inches = Input.getInteger("Inches: ");
        
        inches += feet * INCHES_PER_FOOT;
        
        doubleCentimeters = inches * CENTIMETERS_PER_INCH;
        
        doubleCentimeters += 0.5; //round float point value

        centimeters = doubleCentimeters.intValue();
        
        meters = centimeters/100;
        
        centimeters %= 100;

        System.out.println(meters + "m " + centimeters + "cm");

    }
}
