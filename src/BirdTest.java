import java.nio.channels.FileChannel;

public class BirdTest {
    public static void main(String[] args) {
//        Bird cardinal = new Bird();
//        cardinal.setName("Cardinal");
//        cardinal.setCanFly(true);
//        cardinal.makeNoise();
//        cardinal.move();

//        Duck mallard = new Duck();
//        mallard.setName("Mallard");
//        mallard.makeNoise();
//
//        Finch lesserGoldFinch = new Finch();
//        lesserGoldFinch.setName("Lesser Goldfinch");
//        lesserGoldFinch.makeNoise();
        Penguins penguins = new Penguins();
        penguins.setName("Emperor Penguin");
        penguins.setCanFly(false);
        penguins.move();
        penguins.makeNoise();

    }
}
