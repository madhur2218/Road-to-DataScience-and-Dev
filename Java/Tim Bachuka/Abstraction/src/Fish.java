public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println("moving");
        if(speed == "slow"){
            System.out.println("lazy swimming");
        }
        else{
            System.out.println("fast swimming");
        }

    }

    @Override
    public void makeNoise() {
        if(type == "Goldfish"){
            System.out.println("swishhh");
        }

        else{
            System.out.println("splash");

        }
    }
}
