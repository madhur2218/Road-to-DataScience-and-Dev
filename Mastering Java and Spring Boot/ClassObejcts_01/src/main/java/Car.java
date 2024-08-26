public class Car {

    private String model;
    private String color;
    private int doors;
    private boolean convertable;


    public void describeCar(){
        System.out.println(doors + "doors" + color + "color" + (convertable ? "convertable" : ""));
    }

    public boolean isTrue(){
        System.out.println("true");
        return true;
    }

}
