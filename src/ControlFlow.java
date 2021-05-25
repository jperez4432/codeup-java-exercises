import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5) {
//            System.out.println("If youre reading this, it means x = 5");
//        }
//

//            int i = 1;
//            while (i < 10) {
//                System.out.println("Now im in the loop, i as not incremented yet and its value is " + i);
//                i++;
//                System.out.println("Im still in the loop, but i has incremented now and its value is " +i );
//            }
//        System.out.println("outside the loop after its executed. the conditional has tested false. the value of i is now " + i);

//1a
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }
//1b
//        for(int i = 2; i < 100; i += 2) {
//            System.out.println(i);
//        }

        Scanner entry = new Scanner(System.in);
        int pin = 12345;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Please enter your pin");
            int userEntry = entry.nextInt();

            if (userEntry == pin)
            {
                System.out.println("Correct, come on in!");
                i = 3;
            } else if (i == 3) {
                System.out.println("Due to multiple failed attempts, you are locked out");
            } else {
                System.out.println("Incorrect, try again");
            }
        }

// 1b-3

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What number would you like see on the table? ");
//        int userInt = scanner.nextInt();
//        System.out.println("");
//        System.out.println("Here is your table!");
//        System.out.println("");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i <= userInt; i++) {
//            System.out.println(i + "      | " + (i * i) + "       |" + "  " + (i * i * i));
//        }
//
//
//        System.out.print("What grade number would you like converted?");
//        int userEntry = scanner.nextInt();
//
//        if (userEntry == 80-100) {
//
//        }
//        System.out.printf("You entered %d%n", userEntry);


    }
}


