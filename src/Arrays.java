import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] numbers = {14, 64, 34, 44};
        numbers[1] = 33;
//        for (int i = 0; i <= numbers.length; i++) {
//            System.out.println(numbers[i]);
        for (int n : numbers) {
            System.out.println(n);
        }

        String[] topFiveBoyNames = new String[6];
        topFiveBoyNames[0] = "Greg";
        topFiveBoyNames[1] = "Jim";
        topFiveBoyNames[2] = "Geoff";
        topFiveBoyNames[3] = "Naysa";
        topFiveBoyNames[4] = "Hideo";
        for (String n : topFiveBoyNames) {
            System.out.println(n);
        }
        boolean[] lookingAtDefaultVals = new boolean[3];

        for (boolean boo : lookingAtDefaultVals) {
            System.out.println(boo);
        }

        Arrays.fill(lookingAtDefaultVals, true);

        for (boolean boo : lookingAtDefaultVals) {
            System.out.println(boo);
        }

        int[] alsoNums = {14,33,34,44};
        for (int n : numbers) {
            System.out.println(n);
        }

        for (int n : alsoNums) {
            System.out.println(n);
        }

        System.out.println(Arrays.equals(numbers, alsoNums));

        int[] yetMoreNums = Arrays.copyOf(numbers, alsoNums);


    }
}