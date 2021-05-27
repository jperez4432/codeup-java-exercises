import java.util.Scanner;

public class Methods {
    public static void sayHello(String name) {
        System.out.printf("Hi there! My name is %s! Have a great day!\n", name);
    }

    public static void sayHello(String Salutation, String name) {
        System.out.printf("%s there! My name is %s! Have a great day\n", Salutation, name);
    }

    public static void sayHello(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("Hello, Darling!");
        }
    }



    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static void willYouTakeUsToMtSplashmore(Scanner sc) {

        System.out.println("Will you take us to Mt. Splashmore?");
        if (!sc.nextLine().equalsIgnoreCase("yes")) {
            willYouTakeUsToMtSplashmore(sc);
        } else  {
            System.out.println("Thanks dad youre the best!");
        }
    }

    public static void bottlesOfBlank(String beverage, int numBottles) {
        if (numBottles == 0) {
            System.out.printf("No More bottles of %s on the wall", numBottles);
        } else if (numBottles == 1){
            System.out.printf("1 Bottle of %s on the wall");
            bottlesOfBlank(beverage, numBottles - 1);
        }
    }



    public static void main(String[] args) {
        sayHello("Juan");
        sayHello("howdy", "meatball");
        sayHello(10);
        System.out.println(multiply(5, 2));;
        int product = multiply(7,3);
        System.out.printf("did you know %d X %d ='s %d", product, product, product*product);

        willYouTakeUsToMtSplashmore(new Scanner(System.in));
       bottlesOfBlank("Tea", 10);
    }


}
