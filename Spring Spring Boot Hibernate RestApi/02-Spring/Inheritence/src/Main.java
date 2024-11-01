//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //super class
//        Base b= new Base();
//        b.setNum1(2);
//        System.out.println(b.getNum1());

        //sub class
//        Derived d = new Derived();
//        d.setNum1(3);
//        System.out.println(d.getNum1());


        //Base b = new Base();

        //Derived d = new Derived(12,23);

//        Derived d = new Derived();
//        Derived2 d2 = new Derived2(1,2,3);

        //Tim Buchaka

        //Animal a1 = new Animal("Generic animal", 300,"large");
        //doanimalstuff(a1,"slow");

        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Doggy", 100,"small");
        doanimalstuff(dog1, "fast");
//        doanimalstuff(dog2, "fast");


    }

    public static void doanimalstuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("................");
    }

}