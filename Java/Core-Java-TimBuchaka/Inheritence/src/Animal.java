public class Animal {

    //This is a super class Animal
    protected String type;
    private String size;
    private double weight;

    public Animal(){
    }
    public Animal(String type,String size, double weight) {
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

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

    @Override
    public String toString() {
        return "Animal{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type+ " moves "+ speed);
    }

    public void makeNoise(){
        System.out.println(type+ " makes some kind of noise ");
    }

    public void eat(String eat){
        System.out.println(type+ " eats "+ eat );
    }
}
