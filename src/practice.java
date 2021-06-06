import java.util.Scanner;

public class practice {
    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.println(getPower(3, 3));
    }
//    public static void count(int n) {
//        if (n <= 0) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//    }
//
//    public static void main(String[] args) {
//        count(5);
//
//    }
}

//    public static String sayHello(String name) {
//        return String.format("Hello, %s!", name);
//    }
//
//

// version 1
//        public static void sayHello(int times) {
//            for (int i = 0; i < times; i += 1) {
//                sayHello();
//            }
//        }
// version 2
//        public static void sayHello() {
//            sayHello("Hello", "World");
//        }
// version 3
     //   public static void sayHello(String name) {
 //           sayHello("Hello", name);
 //       }
// version 4
//        public static void sayHello(String greeting, String name) {
//            System.out.println(greeting + ", " + name + "!");
//        }
//        public static void main(String[] args) {

       // System.out.println(sayHello("Juan"));




//        String greet = "Hello World!";
//        String world = "World";
//        System.out.println(greet.indexOf("!"));



//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int userInput = sc.nextInt();
//        System.out.println("You entered " + userInput);
//
//        System.out.println("enter three words");
//
//        String one = sc.next();
//        String two = sc.next();
//        String three = sc.next();
//
//        System.out.printf("You entered %s %s %s", one, two, three);


//        double pi = 3.14159;
//        int almostPi = (int) pi;
//        int favoriteNumber = 44;
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        //int three = (int) o;
//        long myNumber;
//       // System.out.println(myNumber);
//        System.out.println(theNumberThree);
//        System.out.println(o);
//      //  System.out.println(three);
//        String meow = "Meow meow meowdy meow meow";
//        System.out.println(meow);
//        System.out.println(favoriteNumber);
//        System.out.println("Hello World!");
//        System.out.println(pi);
//        System.out.println(almostPi);
//        {
//            System.out.println("Code inside of curly braces should be indented");
//            System.out.println("With 4 spaces, aka a tab dont be a space guy");
//        }
//    }
//}