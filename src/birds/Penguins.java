package birds;

public class Penguins extends Bird {
    @Override
    public void makeNoise() {
        System.out.println(this.getName() + " goes honk honk!");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " goes waddle waddle!");
    }
}
