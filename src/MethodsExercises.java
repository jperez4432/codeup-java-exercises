import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        String userEntry;
//        do {
//            System.out.println("Enter a number between 1 and 10\n");
//            userEntry = sc.next();
//            if (min < 0 || max > 10) {
//                System.out.println("Try again!");
//            } else if (min >= 0 && max <= 10) {
//                System.out.println("Great job!");
//            }
//        }   while ()
//
//    }

    public static int getInteger(int min, int max) {
        System.out.printf("Give me a number between %d and %d\n", min, max);
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if ((userNumber > max) || (userNumber < min)) {
            System.out.println("Try again!");
            return getInteger(min, max);
        } else {
            System.out.printf("Thank you for following directions! Your number was ");
            return userNumber;
        }
    }

//    public static int dice(Scanner sc) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many sides would you like on your dice?");
//
//    }
// only issue is trying to find out how to skip to next method since its an if else statement
//    public static String factorial() {
//        Scanner sc = new Scanner(System.in);
//        String choice;
//
//
//        int userInput;
//        System.out.println("Pick a number between 1 and 10");
//        userInput = sc.nextInt();
//        int i, fact = 1;
//
//        for (i = 1; i <= userInput; i++) {
//            fact = fact * i;
//            System.out.println(i + "!= " + fact);
//            // System.out.println( i + "! = " + count++ + "X" + count2++ +"X" + fact);
//        }
//        System.out.println("Factorial of " + userInput + " is: " + fact + ".\nWould you like to continue? Enter Yes/No");
//        choice = sc.next();
//        if (choice.equals("Yes") || choice.equals("yes")) {
//            return factorial();
//        } else {
//            System.out.println("Thank you!");
//        }
//        return factorial();
//    }


    public static int dice (){
        System.out.println("Welcome to the Dice Game! We will be rolling two dice and displaying the sum. How may sides would you like your dice to have?");
        Scanner sc = new Scanner(System.in);
        int sides = sc.nextInt();
        int die1 = (int)(Math.random()* sides +1);
        int die2 = (int)(Math.random()* sides +1);
        int result = die1 + die2;
        System.out.println("Are you ready to roll!? ");
        // System.out.println(die);
        return result;
    }

    public static void main(String[] args) {




        System.out.println(multiply(1, 2));
        System.out.println(add(20,10));
        System.out.println(subtract(30, 19));
        System.out.println(divide(100, 10));
        System.out.println(modulus(26, 15));
        System.out.println(getInteger(1, 9));
    //    System.out.println(factorial());
        System.out.println(dice());
    //        System.out.println(factorial(4));
     //   System.out.println(dice(new Scanner(System.in)));
    }
}

