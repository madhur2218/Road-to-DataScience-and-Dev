public class Monitor extends  Product{
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x , int y, String color){
        System.out.println("Drawing pixel at " + x + " " + y+ " in color "+ color);

    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution='" + resolution + '\'' +
                ", size=" + size +
                "} " + super.toString();
    }
}
