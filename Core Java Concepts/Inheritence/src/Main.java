//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Generic Animal", "Huge",400);
        a1.makeNoise();
        a1.move("slow");
       doAnimalStuff(a1,"slow");

        Dog d1 = new Dog();
        doAnimalStuff(d1,"fast");

    }

    public static void doAnimalStuff(Animal animal, String speed){
         animal.makeNoise();
         animal.move("fast");
         animal.toString();
        System.out.println(speed.toUpperCase());

    }
}
