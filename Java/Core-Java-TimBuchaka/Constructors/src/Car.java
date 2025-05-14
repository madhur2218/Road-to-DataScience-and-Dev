public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public Car(String color, boolean convertible, int doors, String make, String model) {
        this.color = color;
        this.convertible = convertible;
        this.doors = doors;
        this.make = make;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
       if(make == null){
               make ="UNKNOWN";
       }
       String toLower = make.toLowerCase();
       switch(toLower){
           case "holden", "porsche", "tesla" -> this.make = make;
           default ->
               this.make = "Unsupported";
       }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                ", convertible=" + convertible +
                '}';
    }
}
