public class Animal {
    private String type;
    private double weight;
    private String size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Animal(){
        System.out.println("in parent constructor without arguments");

    }

    public Animal(String size, double weight){
        System.out.println("in parent constructor with two arguments");
    }
    public Animal(String size, double weight, String type) {
        System.out.println("in parent constructor with arguments");
        this.size = size;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", size='" + size + '\'' +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " moves "+ speed);
    }

    public void makeNoise(){
        System.out.println(type+ " makes some kind of noise ");

    }}
