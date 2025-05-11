public class My_car {
    private String make= "Audi";  // statically decalring variable name and not dynamically
    private String model= "A3";
    private int doors = 4;
    private Boolean isConvertable = true;

    public void setMake(String make){
        this.make = make;
    }

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Boolean getConvertable() {
        return isConvertable;
    }

    public void setConvertable(Boolean convertable) {
        isConvertable = convertable;
    }

    @Override
    public String toString() {
        return "My_car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                ", isConvertable=" + isConvertable +
                '}';
    }
}
