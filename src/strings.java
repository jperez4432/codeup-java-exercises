import java.util.Locale;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        char character = 'd';
        System.out.println(character == 'd');

        Scanner scanner = new Scanner(System.in);
        String bob = "Uncle Bob";
        System.out.println("Hey juan, whos your fave unc");
        String maybeBob = scanner.nextLine();
        System.out.println("User answered with correct answer AND capitalization: "  + bob.equals(maybeBob));
        System.out.println("User answered with correct answer: " + bob.equalsIgnoreCase(maybeBob));

        String juan = "Juan";
        String june = "June";
        String firstLetterJuan = ("" + juan.charAt(0)).toLowerCase(Locale.ROOT);
        System.out.println("Juan and June start with the same letter?: " + june.startsWith(firstLetterJuan));

        String coolCats = "Cool Cats are cool, and we like it like that.";
        System.out.println(coolCats.startsWith("Cool Cats are cool"));
        System.out.println(coolCats.toLowerCase(Locale.ROOT).startsWith("cool cats are cool"));
        System.out.println(coolCats.endsWith("like that."));

        // Manipulation
        int locationOfAInJune = june.indexOf("n");
        System.out.println("The location of 'n' in the string of \"June\" is: " + locationOfAInJune);

        int coolCatsLength = coolCats.length();
        System.out.println(coolCatsLength);

//
//        String hiDad = "Hello, Father!";
//        String father = hiDad.substring(7, 13);
//        System.out.println(father);
//        System.out.println(hiDad.replace(father, dad));
//        System.out.println(hiDad);
//        hiDad = hiDad.replace(father, dad);
    }
}
