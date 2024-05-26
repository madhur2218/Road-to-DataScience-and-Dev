abstract public class Mammal extends Animal{

    public Mammal(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed){
        System.out.println("hello");
    }

    abstract void shedHair();


}
