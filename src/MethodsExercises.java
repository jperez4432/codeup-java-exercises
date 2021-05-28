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

//    public static int factorial(Scanner sc) {
//    System.out.println("Enter a number from 1 - 10.\n");
//    Scanner sc = new Scanner(System.in);
//    int userNumber = sc.nextInt();
//    for (i = 1; i <=userNumber; i++){
//        fact = fact*i;
//    }
//    System.out.println("Factorial of %d is " + fact + "" , userNumber);
//}
// recursion method
//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1;
//        } else {
//            int i = 1;
//            long fact = 1;
//            int number = 4;//It is the number to calculate factorial
//            fact = factorial(number);
//            System.out.println("Factorial of " + number + " is: " + fact);
//            return (n * factorial(n - 1));
//
//
//        }
//    }


//    public static int dice(Scanner sc) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many sides would you like on your dice?");
//
//    }

    public static String factorial(Scanner sc) {
       // Scanner sc = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 10");
        int userInput;
        userInput = sc.nextInt();
//        System.out.println(userInput);
        int i, fact = 1;
        int count = 1;
        int count2 = 2;
        int count3 = 3;
//        int number=5;//It is the number to calculate factorial
        for (i = 1; i <= userInput; i++) {

            fact = fact * i;
            System.out.println(i + "!= " + fact );
           // System.out.println( i + "! = " + count++ + "X" + count2++ +"X" + fact);

        }
        return "Factorial of " + userInput + " is: " + fact;
    }


    public static void main(String[] args) {




        System.out.println(multiply(1, 2));
        System.out.println(add(20,10));
        System.out.println(subtract(30, 19));
        System.out.println(divide(100, 10));
        System.out.println(modulus(26, 15));
        System.out.println(getInteger(1, 9));
        System.out.println(factorial(new Scanner(System.in)));
    //        System.out.println(factorial(4));
     //   System.out.println(dice(new Scanner(System.in)));
    }
}

