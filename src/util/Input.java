package util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);


    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter a sentence.");
        String userSentence = sc.nextLine();
        System.out.println("Your sentence is " + userSentence);
        return userSentence;
    }

    public boolean yesOrNo() {
        System.out.println("Enter Yes or No:\n");
        String userEntry = sc.nextLine();
        boolean result = false;
        if (userEntry.equalsIgnoreCase("yes")) {
            result = true;
        } else if (userEntry.equalsIgnoreCase("no")) {
            result = false;
        }
        System.out.println("Your boolean is: " + result);
        return result;
    }

    public int getInt(int min, int max) {
        System.out.printf("Please enter a number between %d and %d: %n", min, max);
        int userInputNum = sc.nextInt();
        if (userInputNum > max || userInputNum < min) {
            System.out.println("Sorry! Invalid input");
            return getInt(min, max);
        } else {
            return userInputNum;
        }
    }

    public int getInt() {
        System.out.println("Enter a number");
        int userInput = sc.nextInt();
        return userInput;
    }

    public double getDouble() {
        System.out.println("Enter a number");
        double userEntry = sc.nextDouble();
        return userEntry;
    }

    public double getDoubles(int min, int max) {
        System.out.println("Enter a number");
        double userDouble = sc.nextDouble();
        if (userDouble > max || userDouble < min) {
            System.out.println("Invalid entry. Please try again");
            return getDoubles(min, max);
        } else {
            System.out.printf("Thank you! Your number is %f, which is between %f and %f.", userDouble, min, max);
            return userDouble;
        }
    }


    public static void main(String[] args) {

    }

}
