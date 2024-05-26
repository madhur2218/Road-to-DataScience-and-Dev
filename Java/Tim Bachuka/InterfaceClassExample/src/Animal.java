enum FlightSatages implements Trackable{
    ground,
    launch;

    @Override
    public void track() {

    }
}
record Dragonfly(String name, String type) implements FlightEnabled{

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface FlightEnabled{

    public static final double km= 12312.123;

    void takeoff();
    public void land();
    void fly();


}

interface Trackable{
    void track();

}

interface OrbitEarth extends FlightEnabled{
    public void achieveOrbit();

}


class Sattelite implements OrbitEarth{

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void achieveOrbit() {

    }
}

public abstract class Animal {

    public abstract void move();
}
