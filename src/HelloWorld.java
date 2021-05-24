import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.print(", World!");



    byte smallNumber = 34;
    System.out.println(smallNumber);
    short notAsASmallNumber = 30000;

    int num = 45000000;

    long largeNumber = 14L;

        System.out.println(largeNumber);

        float decimal = 1.5F;

        double bigDecimal = 45;
        System.out.println(bigDecimal);

        final char single_Letter = 'g';

        boolean amILearningJava = true;

        String message = "Hows it going?\n We all \"good\" here?";
        System.out.println(message);

        int sum = 4 + 5;
        System.out.println(sum);

        int difference = 72 - 19;
        System.out.println(difference);

        int product = 11 * 9;
        System.out.println(product);

        int quotient = product / sum;
        System.out.println(quotient);


        int remainder = difference % sum;
        System.out.println(remainder);


        int whatWullTHisBe = -4 * 2;
        System.out.println(whatWullTHisBe);

        System.out.println(sum++);
        System.out.println(sum);

        int iAmAnInt = 44;
        long iAmAnLong = iAmAnInt;
        System.out.println(iAmAnLong);

        iAmAnLong = Long.MAX_VALUE;
        System.out.println(++iAmAnLong);
        iAmAnInt = (int) iAmAnLong;
        System.out.println(iAmAnInt);

        iAmAnInt = 27;
        double iAmADouble = iAmAnInt;
        System.out.println(iAmADouble);

        iAmADouble = 3.141598;
        iAmAnInt = (int) iAmADouble;
        System.out.println(iAmAnInt);

        boolean iAmABoolean = false;
        System.out.println();
    }
}
