import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //Animal a1 = new Animal();

        Dog d1 = new Dog("woof", "big", 123);
        d1.makeNose();
        d1.move("fast");


        doAnimalStuff(d1);

        List<Animal> a1 = new ArrayList<>();
        a1.add(new Fish("GoldFish", "small", 12));
        a1.add(new Fish ("nemo", "big", 123));
        a1.add(new Dog("pug","small",32));

        for(Animal a : a1 ){
            doAnimalStuff(a);


        }    }

    private static void doAnimalStuff(Animal a){
        a.makeNose();
        a.move("slow");


    }
}