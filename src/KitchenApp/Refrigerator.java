package KitchenApp;

import java.util.Scanner;

public class Refrigerator extends Appliance{

    private boolean hasIce;

    public boolean isHasIce() {
        return hasIce;
    }

    public void setHasIce(boolean hasIce) {
        this.hasIce = hasIce;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setBrandName(String brandName){
        this.brandName = brandName;
    }

    public Refrigerator(String type, String brandName, boolean hasIce) {
        super(type, brandName);
        this.hasIce = hasIce;
    }

//    public void sayHello(){
//        System.out.println("Hello!");
//    }

    public void keepFresh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to put something in the fridge? (Y/N)");
        String userChoice = sc.nextLine();
        while (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
            System.out.println("what would you like to put in the fridge?");
            String item = sc.nextLine();
            System.out.printf("Sounds good! I'll keep yur %s cold for you!\n", item);
            System.out.println("Would you like to put anything else in the fridge? (Y/N)");
            userChoice = sc.nextLine();
        }
        System.out.println("Okay, stay cool!");
    }
}