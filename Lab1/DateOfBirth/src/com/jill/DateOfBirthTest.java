package com.jill;

public class DateOfBirthTest {
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        String dob;

        day = Input.getInteger("the day you were born: ");
        month = Input.getInteger("the month you were born: ");
        year = Input.getInteger("the year you were born: ");

        System.out.println("Your date of birth is: " + day+"/"+month+"/"+year);

    }
}
