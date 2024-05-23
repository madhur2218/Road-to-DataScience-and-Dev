public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println("moving");
        if(speed == "slow"){
            System.out.println("walking");
        }
        else{
            System.out.println("running");
        }

    }

    @Override
    public void makeNoise() {
        if(type == "wolf"){
            System.out.println("howling");
        }

        else{
            System.out.println("wooff");

        }
    }
}
