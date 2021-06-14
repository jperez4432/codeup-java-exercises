package util;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
      //  System.out.println("Enter a sentence.");
        String userSentence = sc.nextLine();
 //       System.out.println("Your sentence is " + userSentence);
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
    //    System.out.println("Your boolean is: " + result);
        return result;
        //String userInput = this,sc,nextLine();
        //return userInput.trim().equalsIgnoreCase("y") || userInput.trim().equalsIgnoreCase("yes");
    }

//    public int getInt(int min, int max) {
//
//        System.out.printf("Please enter a number between %d and %d: %n", min, max);
//        int userInputNum = sc.nextInt();
//        if (userInputNum > max || userInputNum < min) {
//            System.out.println("Sorry! Invalid input");
//            return getInt(min, max);
//        } else {
//            return userInputNum;
//        }
//    }

//    public int getInt() {
//        System.out.println("Enter a number");
//        int userInput = sc.nextInt();
//        return userInput;
//        //return this.sc.nextInt();
//    }
//// whats used on the circle app to use the user input for the radius
//    public double getDouble() {
//        System.out.println("Enter a number");
//        double userEntry = sc.nextDouble();
//        return userEntry;
//    }

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

    public int getInt2(){
        System.out.print("Enter a number: ");
        try{
            return Integer.valueOf(getString());
        }catch(NumberFormatException nfe){
            System.out.println("That's not a number!");
            return getInt2();
        }
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.sc.nextLine();
    }

    public int getInt() {
        return this.sc.nextInt();
    }

    // TODO: **BONUS**
//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        return this.scanner.nextInt();
//    }

    // refactor getInt method to use try-catch
    public int getInt(String prompt){
        int number;
        try {
            number = Integer.valueOf(getString(prompt));
            return number;
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input, try again: ");
            return getInt(prompt);
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Give me a whole number between %d and %d", min, max);
        int userNumber = this.sc.nextInt();

        if(userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.println("That number is invalid.");
            return getInt(min, max);
        }
    }

    // TODO: **BONUS**
    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int userNumber = this.sc.nextInt();

        if(userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.println("That number is invalid.");
            return getInt(min, max);
        }
    }


    public double getDouble() {
        return this.sc.nextDouble();
    }

    // TODO: **BONUS**
    public double getDouble(String prompt) {
        System.out.println(prompt);
        return this.sc.nextDouble();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Give me a decimal number between %f and %f", min, max);
        double userNumber = this.sc.nextDouble();

        if(userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.println("That number is invalid.");
            return getDouble(min, max);
        }
    }

    // TODO: **BONUS**
    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double userNumber = this.sc.nextDouble();

        if(userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.println("That number is invalid.");
            return getDouble(min, max);
        }
    }
//    public int getInt2(){
//        try {
//            return Integer.parseInt(getString("Enter a number"));
//        } catch (NumberFormatException e) {
//            System.err.println("Invalid input, try again.");
//            return getInt2();
//        }
//    }
    //testing the examples

//public static void main(String[] args) {

  //  System.out.println(1 / 0);
//
//    try {
//        System.out.println("Let's see...");
//        int result = 1 / 0;
//        System.out.println("I can divide by zero!");
//    } catch (ArithmeticException e) {
//        System.out.println("Math still works!");
//    }


//}
}
