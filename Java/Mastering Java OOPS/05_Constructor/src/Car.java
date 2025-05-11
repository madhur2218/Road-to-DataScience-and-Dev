public class Car {
    private String make;
    private String model;
    private String colour;
    private int doors;

    public Car(){
        this("Tesla");
        System.out.println("this is default constructor");
    }
    public Car(String make){
        this(make,"X2");
        this.make = make;
        System.out.println("this is constructor with one parameter");
    }
    public Car(String make, String model){
        this(make,model,"White",2);
        this.make=make;
        this.model = model;
        System.out.println("this is constructor with 2 parameters");
    }

    public Car(String make, String model, String colour, int doors) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.doors = doors;
        System.out.println("this is constructor with all parameters");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", doors=" + doors +
                '}';
    }
}
