import java.util.Scanner;

public class ExceptionsStudy {

    public void askForAnInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = scanner.nextLine();
        try {
            int userInputInteger = Integer.parseInt(userInput);
            System.out.println("The integer in your string is: " + userInputInteger);
        } catch (NumberFormatException nfe) {
            System.out.println("Uh oh, " + nfe.getMessage() + " there is no integer!");
        } finally {
            System.out.println("Thank you for using this complex and useful application.");
            System.out.println("Please come back and visit us.");
        }
    }
}