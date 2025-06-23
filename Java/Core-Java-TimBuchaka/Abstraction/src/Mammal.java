abstract public class Mammal extends Animal{
    Mammal(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void move(String speed) {
        System.out.println(getExplicitType()+ " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }
}
