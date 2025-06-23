abstract public class Animal {
    protected String type;
    private String size;
    private int weight;

    Animal (String type, String size, int weight){
        this.type=type;
        this.size= size;
        this.weight=weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();
    public abstract void shedHair();

    public  final String getExplicitType(){   //abstract class providing a concrete method
        return getClass().getTypeName()+" ("+ type+ " )";
    }

}
