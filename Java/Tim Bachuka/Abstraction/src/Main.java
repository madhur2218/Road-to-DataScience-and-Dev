public class Main {
    public static void main(String[] args) {

        //Base b1 = new Base();
        //Child c1 = new Child();


        Dog d1 = new Dog("wolf", "big", 23.12);
        d1.makeNoise();

        doAnimalStuff(d1);
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");

    }

}
