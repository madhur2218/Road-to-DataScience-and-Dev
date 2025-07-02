interface FlightEnabled{
    double MILES_TO_KM=1.60934;
    double KM_TO_MILES = 0.621371;


    public abstract void takeoff();  // hover over public and abstract here
    abstract void land();
    void fly();
}