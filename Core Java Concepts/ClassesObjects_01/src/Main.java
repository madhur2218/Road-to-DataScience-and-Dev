//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.describeCar();

        //c1.make();
        //c1.colors();  -// will get error in these 2 as make and colors are private fields and cannot be called in any other class
        c1.getColors();  //hence use getter and setters
        System.out.println(c1.getColors());
        c1.setColors("black");
        System.out.println(c1.getColors());
        c1.describeCar();

        Car c2 = new Car();
        c2.setMake("audi");
        c2.setModel("f2");
        c2.setDoors(2);
        c2.setColors("red");
        c2.setConvertable(false);
        c2.describeCar();

        Car c3 = null; //initializing instance of car with null reference, if we set anything it gives nullpointer exception




    }
}