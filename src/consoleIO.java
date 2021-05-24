import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class consoleIO {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String name ="Eduardo";
        System.out.printf("Hello, %s%n", name);

        System.out.format("%d is %s's favorite number\nThis is a %b statement", 42, name, false);
        System.out.println("im on a new line");

        System.out.println("Hello," + name);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey man, Hows it going?");
        String userInput = scanner.nextLine();
        System.out.printf("Youre feeling: %s%n", userInput);

        System.out.println("Give me a number.");
        int num = scanner.nextInt();
        System.out.printf("Youre number is %d%n", num);

    }

}
