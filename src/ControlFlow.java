import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5) {
//            System.out.println("If youre reading this, it means x = 5");
//        }
//

            int i = 1;
            while (i < 10) {
                System.out.println("Now im in the loop, i as not incremented yet and its value is " + i);
                i++;
                System.out.println("Im still in the loop, but i has incremented now and its value is " +i );
            }
        System.out.println("outside the loop after its executed. the conditional has tested false. the value of i is now " + i);

    }
}
