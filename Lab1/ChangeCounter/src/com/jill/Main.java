package com.jill;

public class Main {

    public static void main(String[] args) {

        int fifties, twenties, tens, fives, twos, ones, pounds, pence;

        fifties = Input.getInteger("number of 50p coins: ");
        twenties = Input.getInteger("number of 20p coins: ");
        tens = Input.getInteger("number of 10p coins: ");
        fives = Input.getInteger("number of 5p coins: ");
        twos = Input.getInteger("number of 2p coins: ");
        ones = Input.getInteger("number of 1p coins: ");

        //calculate total pence
        pence = (50 * fifties) + (20 * twenties) + (10 * tens) + (5 * fives) + (2 * twos) + (ones);

        pounds = pence / 100;
        pence %= 100;

        System.out.println("pounds: " +pounds + " pence: " + pence);
        System.out.println("Total is £" + pounds + "." + pence);


    }
}
