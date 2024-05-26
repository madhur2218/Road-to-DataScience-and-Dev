abstract public class Animal {

    protected String type;
    private String size;
    private int weight;

    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNose();

    public final String getExplicitType(){
        System.out.println("getting explicite type");
        return getClass().getTypeName()+type;
    }
}
