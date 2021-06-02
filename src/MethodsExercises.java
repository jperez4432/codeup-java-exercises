
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

    public static String factorial() {
        Scanner sc = new Scanner(System.in);
        String choice;
        int userInput;
        System.out.println("Pick a number between 1 and 10");
        userInput = sc.nextInt();
        int i, fact = 1;
        String thanks = "Thank you";
        for (i = 1; i <= userInput; i++) {
            fact = fact * i;
            System.out.println(i + "!= " + fact);
        }
        System.out.println("Factorial of " + userInput + " is: " + fact + ".\nWould you like to continue? Enter Yes/No");
        choice = sc.next();
        while (choice.equalsIgnoreCase("yes")){
            return factorial();
        }
        return thanks;

    }
        public static String dice () {
        Scanner sc = new Scanner(System.in);
        String userResponse;
            System.out.println("Welcome to the Dice Game! We will be rolling two dice and displaying the sum. How may sides would you like your dice to have?");
            int sides = sc.nextInt();
            int die1 = (int) (Math.random() * sides + 1);
            int die2 = (int) (Math.random() * sides + 1);
            int result = die1 + die2;
            String displayResult = "Your result is " + result + "!";
            System.out.println(displayResult);
            System.out.println("Would you like to continue playing? Enter Yes or No");
            userResponse = sc.next();

            if (userResponse.equalsIgnoreCase("yes")) {
                return dice();
            } else {
                String thanks = "Thank you for playing";
                return thanks;
            }
        }


    public static String game() {
        Scanner sc = new Scanner(System.in);
        String thanks = "Thank you for playing";
        String wrong = "NOPE! TRY AGAIN!";
        int number = (int) (Math.random() * 100);
        System.out.println("Welcome to the Guessing Game! You must pick a number between 1 and 100\nWhat is your first guess?");
        int userGuess = sc.nextInt();
        for (int i = 1; i <= 5; i++) {
            if (userGuess == number) {
                System.out.println("WOW! GOOD GUESS!");
                return thanks;

            } else if (userGuess > number) {
                System.out.println("Lower! Try again.");

                userGuess = sc.nextInt();
            } else if (userGuess < number) {
                System.out.println("Higher! Try again");
                userGuess = sc.nextInt();
            }
        }
            System.out.println("Your number is " + number);
            return thanks;
    }

    public static void main(String[] args) {
        System.out.println(multiply(1, 2));
        System.out.println(add(20,10));
        System.out.println(subtract(30, 19));
        System.out.println(divide(100, 10));
        System.out.println(modulus(26, 15));
        System.out.println(getInteger(1, 9));
        System.out.println(factorial());
        System.out.println(dice());
        System.out.println(game());
    //        System.out.println(factorial(4));
     //   System.out.println(dice(new Scanner(System.in)));
    }
}

