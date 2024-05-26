import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Base b1 = new Base();
        //Child c1 = new Child();


        Dog d1 = new Dog("wolf", "big", 23.12);
        d1.makeNoise();

        doAnimalStuff(d1);

        List<Animal> l1 = new ArrayList<>();
        l1.add(d1);
        l1.add(new Dog("wolf", "small", 23.12));
        l1.add(new Dog("dog", "big", 212.32));
        l1.add(new Fish("Goldfish", "small", 314.143));
        l1.add(new Fish("Nemo", "big",34.231 ));

        for(Animal animal : l1){
            doAnimalStuff(animal);
        }
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");

    }

}
