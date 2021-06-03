public class Duck extends Bird {
    // inherits from bird
    //inherits all public methods
//when overriding you have to fulfill the protocol
    //the arguments must be the same, and the return types compatible
    //if you change arguments or return types, you are overloading not overriding
        public void makeNoise(){
            super.makeNoise();
            System.out.println("Quack Quack!");
        }
}
