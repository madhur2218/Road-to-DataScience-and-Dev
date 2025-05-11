import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("big", "Wolf",20.33d);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("pug","small",23.3d));
        animals.add(new Fish("goldfish","very small",1.3d));
        animals.add(new Fish("starfish","very small",2.3d));
        animals.add(new Dog("german shephard","very large",266.3d));

        for(Animal animal : animals){
            doAnimalStuff(animal);
        }

//        for(int i=0; i<animals.size();i++){
//            Animal animal = animals.get(i);
//            doAnimalStuff(animal);
//        }


    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}