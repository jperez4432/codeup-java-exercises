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
        // this.sc = new Scanner(System.in);
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
        //String userInput = this,sc,nextLine();
        //return userInput.trim().equalsIgnoreCase("y") || userInput.trim().equalsIgnoreCase("yes");
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
        //return this.sc.nextInt();
    }
// whats used on the circle app to use the user input for the radius
    public double getDouble() {
        System.out.println("Enter a number");
        double userEntry = sc.nextDouble();
        return userEntry;
    }

    public double getDoubles(int min, int max) {
        System.out.println("Enter a number");
        double userDouble = sc.nextDouble();
        if (userDouble >= max || userDouble <= min) {
            System.out.println("Invalid entry. Please try again");
            return getDoubles(min, max);
        } else {
            System.out.printf("Thank you! Your number is %f, which is between %f and %f.", userDouble, min, max);
            return userDouble;
        }
    }


    public static void main(String[] args) {

    }

//    public int getInt2(){
//        try {
//            return Integer.parseInt(getString("Enter a number"));
//        } catch (NumberFormatException e) {
//            System.err.println("Invalid input, try again.");
//            return getInt2();
//        }
//    }
}
