public class Horse extends Mammal {

    Horse(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void shedHair() {
        System.out.println("sheds in the spring"+ getExplicitType());
    }
}
