import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ask Bob anything");
        String userInput = sc.nextLine();
        if (userInput.endsWith("?")) {
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, Chill out!");
        } else {
            System.out.println("Fine. Be that way!");
        }
    }
}
