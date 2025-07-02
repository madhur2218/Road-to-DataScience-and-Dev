import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        //Bird b2 = new Animal();   this is not possible
        FlightEnabled flightenabed = bird;
        Trackable trackable = bird;

        Jet j = new Jet();


       // animal.move();
        //flightenabed.move();
        //trackable.move();

//        flightenabed.takeoff();
//        flightenabed.fly();
//        flightenabed.land();
//        trackable.track();
        inFlight(flightenabed);
        inFlight(j);

        Trackable t1 = new Truck();
        t1.track();

        double kms_travelled = 100;
        double milesTravelled = kms_travelled* FlightEnabled.KM_TO_MILES;

        ArrayList<FlightEnabled> flies = new ArrayList<>();
        



    }

    public static void inFlight(FlightEnabled flier){
         flier.takeoff();
         if(flier instanceof Trackable tracked){
             tracked.track();
         }
        flier.land();

    }
}