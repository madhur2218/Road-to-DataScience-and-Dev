import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Animal a = new Animal("animal","big",100);

        Dog d1 = new Dog("Wolf", "big",1000);
        d1.makeNoise();
        doAnimalStuff(d1);

        System.out.println("-------------------------------");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(d1);
        animals.add(new Dog("German shephard","big",150));
        animals.add(new Dog("Pug","small",30));
        animals.add(new Fish("Gold fish","small",10));
        animals.add(new Fish("Barracuda","small",20));
        animals.add(new Horse("Donkey","small",20));

        for (Animal animal : animals){
            doAnimalStuff(animal);
            if(animal instanceof  Mammal currentMammal){
                currentMammal.shedHair();
            }
        }


    }

    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");

    }
}