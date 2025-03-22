//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic animal","Huge",400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"fast");

        //Dog retriever = new Dog("Labrador retriever", 60,"floppy","swimmer");
        //doAnimalStuff(retriever,"fast");

        Dog wolf = new Dog("Wolf", 70);
        doAnimalStuff(wolf,"fast");

        Fish goldie = new Fish("Goldfish",0.25,2,2);
        doAnimalStuff(goldie,"Fast");

    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        animal.getSize();
        System.out.println(animal);
        System.out.println("-------------------------");

    }
}