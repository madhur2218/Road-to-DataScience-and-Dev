import java.sql.SQLOutput;

public class AvonCycle implements Bicycle,HornBicycle {

    @Override
    public void applyBrake(int decrease) {
        System.out.println("apply brake");

    }

    @Override
    public void speedUp(int increment) {
        System.out.println("apply brake");
    }


    @Override
    public void blowHornPulsar() {
        System.out.println("horn of pulsar");
    }

    @Override
    public void blowHornKTM() {
        System.out.println("horn of KTM");
    }
}
