public class Animal {
    private String name;
    private int legs;

    Animal(){
        System.out.println("this is a default constructor");
    }

    Animal(String name){
        System.out.println("this is a constructor with 1 parameter");
        this.name =name;
    }

    Animal(String name, int legs){
        System.out.println("this is a constructor with 2 parameters");
        this.name = name;
        this.legs=legs;
    }
}
