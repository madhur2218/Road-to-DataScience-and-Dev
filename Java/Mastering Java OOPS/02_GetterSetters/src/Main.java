public class Main {

    public static void main(String[] args) {

        Car car = new Car();  //CREATING AN OBJECT
//        car.make = "Porsche";
//        car.model = "Carrera";
//        car.color = "Red";
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        My_car audi = new My_car();
        System.out.println(audi);

        audi.setMake("bmw");
        System.out.println(audi.getMake());



    }
}
