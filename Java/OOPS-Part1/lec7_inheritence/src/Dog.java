public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt", "small", 100);
    }

    public Dog(String type, double weight){
        this(type,weight,"Perkey","Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight<35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tails");
        if(speed == "slow"){
            walk();
            wagTail();
        }
        else{
            run();
        }
        System.out.println();
    }

    @Override
    public void makeNoise(){
        if(type == "Wolf"){
            System.out.println("ow owwwww!");
        }
        bark();
        System.out.println();
    }


    private void bark(){
        System.out.println("woof !");
    }

    private void run(){
        System.out.println(type+ " is running !");
    }

    private void walk(){
        System.out.println(type+ " is walking !");
    }

    private void wagTail(){
        System.out.println("dog is wagging tail !");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
