public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight){
        this(type,weight,"Perkery","curley");
    }

    public Dog(String type, double weight, String earShape,String tailShape) {
        super(type, weight<15?"small":(weight<35?"medium":"large"), weight);
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
    public void makeNoise(){
        //super.makeNoise();
        if(type == "Wolf"){
            System.out.println("Wo hoooo!!!");
        }
        bark();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tails");
        if(speed =="slow"){
            walk();
            wagTail();
        }
        else{
            run();
            bark();

        }
    }

    private void bark(){
        System.out.println("Woof !!");
    }

    private void run(){
        System.out.println("Dog running");
    }

    private void walk(){
        System.out.println("Dog walking !!");

    }
    private void wagTail(){
        System.out.println("Dog wagging tail !!");

    }
}
