package com.jill;

public class Main {

    public static void main(String[] args) {

        int year;
        boolean leap;

        year = Input.getInteger("Enter a year: ");

        if(year % 4 == 0){
            leap = true;
        }
        else {
            leap = false;
        }

        System.out.println("year: " + year);
        System.out.println("leap year: " + leap);


    }
}
