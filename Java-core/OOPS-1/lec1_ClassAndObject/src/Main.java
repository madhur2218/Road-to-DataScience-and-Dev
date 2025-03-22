//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        //car.make  = "bmw";  //cannot access sting lik this as they are private
        c1.setMake(null);
        System.out.println(c1.getMake());


// Below code gives us nullpointer exception as the we create reference c2 which does not point to anything in memory and then setting values
//        Car c2 = null;
//        c2.setMake("audo");
//        System.out.println(c2.getMake());

        Car porche1 = new Car();
        porche1.setMake("porche");
        porche1.setModel("taga");
        porche1.setDoors(4);
        porche1.setConvertible(false);
        porche1.describeCar();
    }
}