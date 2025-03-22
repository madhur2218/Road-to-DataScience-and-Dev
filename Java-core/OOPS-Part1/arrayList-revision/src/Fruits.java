public class Fruits {
    String name;
    int quantity;

    public Fruits(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
