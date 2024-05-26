class Sattelite implements OrbitEarth{

    @Override
    public void adhieveOrbit() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
interface OrbitEarth extends flightEngbled{
    void adhieveOrbit();
}

interface flightEngbled {

    double milesTokm = 123.321;
    double kmToMiles = 123124.324;
    void takeOff();
    void land();
    void fly();
}
interface Trackable{
    void track();
}




abstract public class Animal {

    abstract void move();

}
