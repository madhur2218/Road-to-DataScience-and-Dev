public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");


        Bird b1 = new Bird();
        Animal animal = b1;

        flightEngbled f1 = b1;
        Trackable t1= b1;

        animal.move();
//        f1.move();
//        t1.move();

        f1.fly();
        b1.track();
        b1.land();

        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();



    }

    private static void inFlight(flightEngbled flyer){
        flyer.takeOff();
        flyer.fly();

        if(flyer instanceof Trackable trackable){
            trackable.track();
        }
        flyer.land();
    }
}