public class Product {
    private int length;
    private int breadth;
    private int height;
    private String model;
    private String manufacturer;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public Product(int length, int breadth, int height, String model, String manufacturer) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.model = model;
        this.manufacturer = manufacturer;
    }
}
