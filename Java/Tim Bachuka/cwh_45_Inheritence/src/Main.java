public class Main {
    public static void main(String[] args) {

        //Setting up base class
        Base b1 = new Base();
        b1.setId(20);
        System.out.println(b1.getId());

       //Setting up derived class
        Dervied d1 = new Dervied();
        d1.setId(21);
        System.out.println(d1.getId());

        d1.setY(23);
        System.out.println(d1.getY());



        //Example Animal
        Animal a1 = new Animal();
        a1.eat();
        a1.runs();
        a1.walks();

        //For dog -> child class which inherits properties of parent Animal
        Dog dog1= new Dog();
        dog1.sound();
        dog1.eat();
        dog1.runs();
        dog1.walks();

        //For Cow-> child class which inherits properties of parent Animal
        Cow c1= new Cow();
        c1.sound();
        c1.eat();
        c1.runs();
        c1.walks();

        Animal animal1= new Cow();
        animal1.eat();


    }
}