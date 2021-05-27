import org.w3c.dom.ls.LSOutput;

public class MethodsExercises {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static int divide(int num1, int num2) {
        return num1/num2;
    }

    public static void main(String[] args) {
        System.out.println(multiply(1, 2));
        System.out.println(add(20,10));
        System.out.println(subtract(30, 19));
        System.out.println(divide(100, 10));
    }
}

