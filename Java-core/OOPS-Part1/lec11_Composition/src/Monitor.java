public class Monitor extends Product {

    private int size;
    private String resolution;

    public Monitor(String manufacturer, String model ){
        super(manufacturer,model);
    }

    public Monitor(String manufacturer, String model, int size, String resolution){
        super(manufacturer,model);
        this.size= size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.printf(String.format("Drawing pixel at %d, %d and %s",x,y,color));
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
