public class Main {

    public static void main(String[] args) {

        //Animal animal = new Animal("Generic Animal", "Huge", 400);
        //doAnimalStuff(animal, "slow");

        //Dog dog = new Dog();
        //doAnimalStuff(dog, "fast");

        //Dog d2 = new Dog("labra",12,"round","curley");

        Dog yorkie = new Dog("yorkie",15);
        doAnimalStuff(yorkie,"slow");

        Dog retreiver = new Dog("labrador retreiver",20,"floppy","swimmer");
        doAnimalStuff(retreiver,"fast");

        Dog wolf = new Dog("Wolf",50);
        doAnimalStuff(wolf,"fast");

        Fish goldie = new Fish("Goldfish", 0.23,3,2);
        doAnimalStuff(goldie,"fast");

    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
