package com.jill;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int firstNo;
        int secondNo;


        firstNo= Input.getInteger("Enter a number: ");
        secondNo=Input.getInteger("Enter another number: ");

        System.out.println("Addition: " + (firstNo + secondNo));
        System.out.println("Subtraction: " + (firstNo - secondNo));
        System.out.println("Multiplication: " + firstNo * secondNo);
        System.out.println("Division: " + (firstNo / secondNo) + " remainder "+ (firstNo%secondNo));
        System.out.println("floating point division: " + (float) firstNo / secondNo);



    }
}
