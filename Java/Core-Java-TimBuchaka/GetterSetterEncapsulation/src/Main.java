//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("ashutosh");
        System.out.println(dog.getName());

        Animal cat = new Animal();
        cat.setAge(2);
        cat.setColor("white");
        cat.setName("Ashu");
        cat.setWeight(34);

        System.out.println(cat);

        //Everytime we are using set and get to assign and get the values of object, instead of this we use constructors
    }
}