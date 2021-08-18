package com.jill;

public class Main {

    public static void main(String[] args) {


        //ask user what they want to do with the numbers

        //create a user menu
        int userInput;
        do {
            showMenu();
            userInput = askTheUserForInput();
            evaluateUserInput(userInput);
        }
        while (userInput != 0);
    }

    private static void showMenu() {
        System.out.println("These are the options");
        System.out.println("1: add");
        System.out.println("2: subtract");
        System.out.println("3: multiply");
        System.out.println("4: whole number division");
        System.out.println("5: floating point division");
        System.out.println("0: exit");
    }


    private static int askTheUserForInput() {
        return Input.getInteger("Choose an option: ");
    }


    private static void evaluateUserInput(int userInput) {
        switch (userInput) {
            case 1: add();
                break;
            case 2: subtract();
                break;
            case 3: multiply();
                break;
            case 4: wholeNumberDivision();
                break;
            case 5: floatingPointDivision();
                break;
            case 0:
                break;
            default:
                System.out.println("Please choose a correct option");
                break;
        }
    }

    public static void add(){
        int firstValue;
        int secondValue;

        //get 2 numbers first
        firstValue = Input.getInteger("Enter a number: ");
        secondValue = Input.getInteger("Enter another number: ");

        System.out.println("Addition: " + (firstValue + secondValue));
        System.out.println("-------------------------------");

    }

    private static void subtract(){
        int firstValue;
        int secondValue;

        //get 2 numbers first
        firstValue = Input.getInteger("Enter a number: ");
        secondValue = Input.getInteger("Enter another number: ");

        System.out.println("Subtraction: " + (firstValue - secondValue));
        System.out.println("-------------------------------");
    }

    private static void multiply() {
        int firstValue;
        int secondValue;

        //get 2 numbers first
        firstValue = Input.getInteger("Enter a number (not 0): ");
        secondValue = Input.getInteger("Enter another number (not 0): ");

        System.out.println("multiplication: " + (firstValue * secondValue));
            System.out.println("-------------------------------");
        }
    

    private static void wholeNumberDivision(){
        int firstValue;
        int secondValue;

        //get 2 numbers first
        firstValue = Input.getInteger("Enter a number: ");
        secondValue = Input.getInteger("Enter another number: ");

        System.out.println("Whole Number Division: " + (firstValue / secondValue) + " remainder " + (firstValue % secondValue));
        System.out.println("-------------------------------");
    }

    private static void floatingPointDivision(){
        int firstValue;
        int secondValue;

        //get 2 numbers first
        firstValue = Input.getInteger("Enter a number: ");
        secondValue = Input.getInteger("Enter another number: ");

        System.out.println("Floating Point Division: " + (float) firstValue / secondValue);
        System.out.println("-------------------------------");
    }



}



