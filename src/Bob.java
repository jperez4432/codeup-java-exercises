import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String response;
        do {
            System.out.print("Ask Bob anything\n");
            String userInput = sc.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, Chill out!");
            } else if (userInput == "") {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Would you like to keep trying to talk to Bob? Answer yes/no");
            response = sc.next();
        } while (response.equals("yes") || response.equals("Yes"));
    }
}
