public class Car {
    private String make = "Tesla";
    private String model = "Model x";
    private String color= "black";
    private int doors = 4;
    private boolean convertible = true;

    public void describeCar(){
        System.out.println("Car make is "+ make+
                " model "+ model +
                " color "+ color+
                " doors "+ doors +
                " and " +
                (convertible ? "Convertable": " "));
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
