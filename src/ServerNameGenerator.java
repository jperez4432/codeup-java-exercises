import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"average", "breezy", "bright", "clumsy", "colossal", "fluffy", "fantastic", "dusty","dirty", "repulsive"};
        String[] nouns = {"goose", "puppy", "chair", "guitar", "lamp", "elbow", "snail", "meatball", "potato", "squirrel"};

        int index = new Random().nextInt(adjectives.length);
        String random = (adjectives[index]);
      //  System.out.println(random);

        int indexNouns = new Random().nextInt(nouns.length);
        String randomNoun = (nouns[indexNouns]);
        // System.out.println(randomNoun);
        System.out.println("Here is your server name:\n" + random + " " + randomNoun);
        }
    }
