public class Car {
    private String make;
    private String color;
    private int doors;
    private boolean convertable;


    public Car(){
        this("tesla","black",4,false);
        System.out.println("This is default constructor");
    }

    public Car(boolean convertable){
        this("BMW","white",4,convertable);

    }

    public Car(String make, String color, int doors, boolean convertable) {
        System.out.println("Constructor with arguments is called");
        this.make = make;
        this.color = color;
        this.doors = doors;
        this.convertable = convertable;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make == null){
            make = "unknown";
        }
        else{
            String lowerCaseMake = make.toLowerCase();
            switch(lowerCaseMake){
                case "bmw", "audi", "tesla" -> this.make = make;
                default ->{
                    this.make = "Unsupported";
                }
            }
        }


        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertable() {
        return convertable;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", convertable=" + convertable +
                '}';
    }
}
