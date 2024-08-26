import java.util.Locale;

public class Car {

    private String make= "Tesla";
    private String model= "new";
    private String color = "blue";
    private int doors = 4;
    private boolean convertable = false;


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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null){
            this.color = "UNKNOWN";
        }
        else{
            String lowerCaseString = color.toLowerCase(Locale.ROOT);
            switch (lowerCaseString){
                case "maruti" , "suzuki", "bmw" -> this.color = color;
                default -> this.make = "UNSUPPORTED";
            }
        }
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

    public void describeCar(){
        System.out.println(make + " make "+ doors + " doors " + color + " color " + (convertable ? " convertable" : ""));
    }

    public boolean isTrue(){
        System.out.println("true");
        return true;
    }

}
