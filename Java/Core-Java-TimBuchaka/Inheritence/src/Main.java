//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Generic animal","huge", 200.22);
        doAnimalStuff(a1, "slow");

        Dog d1 = new Dog();
        doAnimalStuff(d1,"fast");  // note here i am passing d1(child) and method requires Animal
        //One thing to note over here is that Animal accepts Dog as its child as it inherits all animal attributes

        Cat c1 = new Cat();
        doAnimalStuff(c1,"fast");

        Dog yorkie = new Dog("Yorkie", 12);
        doAnimalStuff(yorkie, "fast");

        Dog retreiver = new Dog("Labrador retreiver", 100,"Floppy","Swimmer");
        doAnimalStuff(retreiver,"fast");

        Dog wolf = new Dog("wolf",14,"Floppy","Swimmer");
        doAnimalStuff(wolf,"very fast");

        Fish goldie = new Fish("goldie","big",20,2,4);
        doAnimalStuff(goldie, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("------------------------------");
    }
}