public class Car {

    private String make = "Tesla";
    private String model = "X ROVER";
    private String colors = "WHITE";
    private int doors = 4;
    private boolean convertable = true;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make ==null){
            this.make = "unknown";
        }
        else{
            String lowerCase = make.toLowerCase();
            switch(lowerCase){
                case "holden", "bmw", "mercedes" -> this.make = make;
                default -> {
                    this.make = "unsupported";
                }
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
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
            System.out.println("Make is :"+make+
                    " model is :"+model+""+
                    " colors is :"+colors+""+
                    " doors is :"+doors+""+
                    " convertable is :"+convertable);

        }
}
