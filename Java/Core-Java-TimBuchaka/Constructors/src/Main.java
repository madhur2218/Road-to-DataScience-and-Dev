import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(12, Arrays.asList("black","brown"),"ashutosh","normal",23);
        System.out.println(dog);

        Animal cat = new Animal(22,Arrays.asList("yellow"),"ishant","normal",11);
        System.out.println(cat);

        Car audi = new Car("white",false,4,"A4","Audi");
        audi.setMake("audi");
        System.out.println(audi);
    }
}