public class BirdShelterTest {
    public static void main(String[] args) {
        Bird[] birds = new  Bird[3];
        birds[0] = new Finch();
        birds[0].setName("Lesser Goldfinch");
        birds[1] = new Duck();
        birds[1].setName("Mallard");
        birds[2] = new Penguins();
        birds[2].setName("Emperor Penguin");

//        for (int i = 0; i < birds.length; i++) {
//            birds[i].makeNoise();
//        }
//
        BirdShelter healingWings = new BirdShelter();
        healingWings.shelterSounds(birds);

        BirdLover BobbyBoy = new BirdLover();
        BobbyBoy.takeBirdToVet(birds[1]);
    }
}
