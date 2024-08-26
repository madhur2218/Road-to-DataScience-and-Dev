public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();

        c1.describeCar();

        System.out.println(c1.getColor());

        c1.setColor("audi");
        c1.describeCar();

        Car c2 = null;
        c2.setColor("black");



    }
}
