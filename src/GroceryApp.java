import java.util.Scanner;
import util.Input;
public class GroceryApp {
    public static Input input = new Input();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to create a grocery list?");
       // String answer = sc.next();
        boolean createList = input.yesOrNo();
        if(createList){
            System.out.println("Lets get started!");
            System.out.println("Select a grocery category:\nMeat\tProduce\t\tDry Goods\tDairy");

            System.out.println("Enter the name of the item");

            System.out.println("Enter the quantity of this item you would like");

        }
    }
}
