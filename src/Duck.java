public class Duck extends Bird {
    // inherits from bird
    //inherits all public methods

        public void makeNoise(){
            super.makeNoise();
            System.out.println("Quack Quack!");
        }
}
