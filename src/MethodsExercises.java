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
        return num1/num2;
    }
    public static int modulus(int num1, int num2) {
        return  num1%num2;
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

public static int getInteger(int min, int max){
    System.out.printf("Give me a number between %d and %d\n", min, max);
    Scanner scanner = new Scanner(System.in);
    int userNumber = scanner.nextInt();

    if ((userNumber > max) || (userNumber < min)) {
        System.out.println("Try again!");
        return getInteger(min, max);
    } else {
        System.out.printf("Thank you for following directions! Your number was %d!%n", userNumber);
        return userNumber;
    }

}




    public static void main(String[] args) {
        System.out.println(multiply(1, 2));
        System.out.println(add(20,10));
        System.out.println(subtract(30, 19));
        System.out.println(divide(100, 10));
        System.out.println(modulus(26, 15));
        System.out.println(getInteger(1, 9));
    }
}

