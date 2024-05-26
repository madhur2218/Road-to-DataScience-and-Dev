public class Bird extends Animal implements FlightEnabled, Trackable{


    @Override
    public void move() {
        System.out.println("flaps wings");

    }

    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName()+" taking off");

    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+" landing now");

    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" flying");

    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+" tracking now");

    }
}
