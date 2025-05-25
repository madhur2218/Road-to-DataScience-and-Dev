public class Fish extends Animal{
    private int fins;
    private int gills;

    public Fish(String type, String size, double weight, int fins, int gills){
        super(type, "small", weight);
        this.fins=fins;
        this.gills = gills;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    public int getGills() {
        return gills;
    }

    public void setGills(int gills) {
        this.gills = gills;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }

    private void moveMuscles(){
        System.out.println("muscle moving!");
    }

    private void moveBackFin(){
        System.out.println("backfin moving!");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed =="fast"){
            moveBackFin();
        }
        System.out.println();
    }
}
