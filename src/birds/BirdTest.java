package birds;

import java.nio.channels.FileChannel;

public class BirdTest {
    public static void main(String[] args) {
//        birds.Bird cardinal = new birds.Bird();
//        cardinal.setName("Cardinal");
//        cardinal.setCanFly(true);
//        cardinal.makeNoise();
//        cardinal.move();
//
//        birds.Duck mallard                          =    new birds.Duck();
//        //declare a reference variable     assigned    call the default constructor
//        mallard.setName("Mallard");
//        mallard.makeNoise();

//        birds.Finch lesserGoldFinch = new birds.Finch();
//        lesserGoldFinch.setName("Lesser Goldfinch");
//        lesserGoldFinch.makeNoise();

//        birds.Penguins penguins = new birds.Penguins();
//        penguins.setName("Emperor Penguin");
//        penguins.setCanFly(false);
//        penguins.move();
//        penguins.makeNoise();

        //Polymorphism allows us tp have different reference and object types
      //  birds.Bird myPenguin = new birds.Penguins();
//
//        birds.Finch houseFinch = new birds.Finch();
//        birds.Bird piratesBestFriend = new birds.Bird();
//        System.out.println(piratesBestFriend.getName());

        Finch cassinsFinch = new Finch("Cassin's birds.Finch", true);
        System.out.println(cassinsFinch.getName());
    }
}
