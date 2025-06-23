public class Fish extends Animal{

    public Fish(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed == "slow"){
            System.out.println(type+ " swimming lazilyy !");
        }
        else{
            System.out.println(type+" darting franaticallyyy !");
        }
    }

    @Override
    public void makeNoise() {
        if (type =="Goldfish"){
            System.out.println(getExplicitType() + " swishh !!");
        }
        else{
            System.out.println(getExplicitType() + " splashh!!");
        }
    }

    @Override
    public void shedHair() {

    }

    @Override
    public String toString() {
        return "Fish{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
