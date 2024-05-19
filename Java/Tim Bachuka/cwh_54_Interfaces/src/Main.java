
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        AvonCycle a1 = new AvonCycle();
        a1.applyBrake(2);

        // we can create properties in interfaces
        System.out.println(a1.a);

        // we cannot modify properties in interfaces as they are final
        //a1.a = 23;

    a1.blowHornPulsar();
    a1.blowHornKTM();
    }
}