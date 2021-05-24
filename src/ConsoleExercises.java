import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number ");
        int num = scanner.nextInt();
        System.out.printf("Your number is %d%n ", num);

        System.out.println("Enter 3 random words ");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();

        System.out.printf("The words are %s %s %s\n", userInput1, userInput2, userInput3);


        System.out.println("Enter a sentence\n");
        scanner.nextLine();
        String userSentence = scanner.nextLine();
        System.out.printf("Your sentence is: %s%n ", userSentence);

        System.out.println("Enter Length in feet of room at Codeup");
        double length = scanner.nextDouble();
        System.out.println("Enter Width in feet of room at Codeup");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the room at Codeup");
        double height = scanner.nextDouble();
        double area = length * width;
        double volume = area * height;
        double perimeter = length*2 + width*2;
        System.out.printf("The Perimeter of this room is %f%nThe area of this room is %f%nThe volume of the room is %f%n", area, perimeter, volume);
    }
}
