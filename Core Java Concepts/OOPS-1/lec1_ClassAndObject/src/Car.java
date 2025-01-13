public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

   public void setMake(String make){
       if(make==null)
           make = "UNKNOWN";
       String lowerCase = make.toLowerCase();
       switch (lowerCase){
           case "holden","porche", "tesla" -> this.make = make;
           default -> this.make="UNSUPPORTED";
       }
   }

   public String getMake(){
       return make;
   }
   public void setModel(String model){
       this.model = model;
   }

   public String getModel(){
       return model;
   }

   public void setColor(String color){
       this.color=color;
   }
   public String getColor(){
       return color;
   }

   public void setDoors(int doors){
       this.doors=doors;
   }

   public int getDoors(){
       return doors;
   }

   public void setConvertible(Boolean convertible){
       this.convertible=convertible;
   }

   public boolean getConvertable(){
       return convertible;
   }

    public void describeCar(){
        System.out.println("Car make is "+ make+
                " model "+ model +
                " color "+ color+
                " doors "+ doors +
                " and " +
                (convertible ? "Convertable": " not convertable"));
    }
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", convertible=" + convertible +
                '}';
    }


}
