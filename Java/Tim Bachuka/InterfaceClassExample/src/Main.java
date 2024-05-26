public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Bird bird= new Bird();

        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        bird.move();
        animal.move();
        flier.fly();
        flier.land();

        FlightEnabled flier1= new Bird();
        flier1.fly();


    }

    private static void inFlight(FlightEnabled flightEnabled){


    }
}