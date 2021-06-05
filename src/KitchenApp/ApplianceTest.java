package KitchenApp;

//Abstract class- highest level parent you can have
// can serce as a superclass, but we cant directly instantiate an abstract class
import java.sql.Ref;

public class ApplianceTest {
    public static void main(String[] args) {
       // Appliance app1 = new Appliance();
        Appliance app1 = new Refrigerator("Two door", "LG", true);

        System.out.println(app1.brandName);
        System.out.println(app1.type);
        //System.out.println(app1.isHasIce());
       // app1.keepFresh();
    }
}