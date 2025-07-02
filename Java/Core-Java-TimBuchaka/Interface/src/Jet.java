public class Jet implements FlightEnabled, Trackable{


    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName()+ " taking off !");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+ " landing !");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+ " is flying !");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+ " coordinates recorded !");
    }
}
