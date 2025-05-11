import java.sql.SQLOutput;

public class MyCar {
    public String make= "Audi";  // statically decalring variable name and not dynamically
    public String model= "A3";
    private int doors = 4;
    private Boolean isConvertable = true;

    public void setMake(String make){
        if(make == null){
            make = "UNKNOWN";
        }
        String lowerCaseMake = make.toLowerCase();
        switch(lowerCaseMake){
            case  "tesla","bmw","audi" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null){
            model = "UNKNOWN";
        }

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
