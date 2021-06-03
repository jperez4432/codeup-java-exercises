public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {14, 64, 34, 44};
        numbers[1] = 33;
//        for (int i = 0; i <= numbers.length; i++) {
//            System.out.println(numbers[i]);
        for (int n : numbers) {
            System.out.println(n);
        }

        String[] topFiveBoyNames = new String[5];
        topFiveBoyNames[0] = "Greg";
        topFiveBoyNames[1] = "Jim";
        topFiveBoyNames[2] = "Geoff";
        topFiveBoyNames[3] = "Naysa";
        topFiveBoyNames[4] = "Hideo";
        for (String n : topFiveBoyNames) {
            System.out.println(n);
        }
    }
}