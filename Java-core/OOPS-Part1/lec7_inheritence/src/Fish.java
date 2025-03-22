public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(int fins, int gills) {
        this.fins = fins;
        this.gills = gills;
    }

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscle(){
        System.out.println("Muscle moving");
    }

    private void moveBackFin(){
        System.out.println("Back fin moving");
    }

    @Override
    public void move(String speed){
        super.move(speed);
        moveMuscle();
        if(speed == "Fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "type='" + type + '\'' +
                ", gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
