public class Dog extends Animal{
    private String earShape;
    private String tailShape;


    //This is a child class Dog and has parent class as Animal, Dog inherits all properties of Animal class
    Dog(){
        super("Libra","huge",100.00);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perkey","Curled");

    }
    public Dog(String earShape, String tailShape) {
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight< 15 ? "small" : (weight<35? "medium": "large"),weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed == "slow"){
            walk();
            wagging();
        }
        else{
            run();
            bark();
        }
        //System.out.println("Dogs walk, run and wag their tail");
    }

    @Override
    public void eat(String eat) {
        super.eat(eat);
    }

    public void makeNoise(){
        if(type =="wolf"){  // from private make type protected
            System.out.println("ow...owwwwwwwwwwww");
        }
        bark();
        System.out.println("making noise");
    }

    private void bark(){
        System.out.println("dog is barking");
    }

    private void run(){
        System.out.println("dog is running");
    }

    private void walk(){
        System.out.println("dog is walking");

    }

    private void wagging(){
        System.out.println("dog is wagging tail");

    }
}
