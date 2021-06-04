public class Finch extends Bird {
    // inherits makeNoise() from Bird
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Tweet Tweet!");
    }
        public Finch(){
        super();
        //must be first or it wont work
        System.out.println("A finch just got created");

    }
    public Finch(String name, boolean canItFly) {
        this.setName(name);
        this.setCanFly(canItFly);
    }
}