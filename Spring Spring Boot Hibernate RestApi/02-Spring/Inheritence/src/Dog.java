public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super();
        System.out.println("in child constructor without arguments");
    }

//    public Dog(String type, Double weight){
//        this(weight,type,"Perky","Curled");
//    }

    public Dog(String size, double weight, String type,String earShape, String tailShape){
        super(size,weight,type);
        this.earShape=earShape;
        this.tailShape=tailShape;
    }

    public Dog(String size, double weight) {
        super(size, weight);
        System.out.println("in chile constructor with two arguments");
    }

    public Dog(String size, double weight, String type) {
        super(size, weight, type);
        System.out.println("in chile constructor with arguments");
    }
}
