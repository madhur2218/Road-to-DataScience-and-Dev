class Animal{

    Animal(){
        System.out.println("making noise - constructor");
    }

    public void noise(){
        System.out.println("making noise");
    }
}


public class Constructor1 {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        obj1.noise();
    }
}
