public class Car {
    private String brand = "bmw";   //These are my fields as they are declared in class not in local method
    private String build = "model x";
    private String model = "2021";
    private boolean convertable = true;
    private int doors =3;
    private String color = "red";

    public void describe(){
        System.out.println(brand + build + model + doors + color + (convertable? "Convertable" : "Non Convertable"));

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isConvertable() {
        return convertable;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
