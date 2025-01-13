//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        House madhurHouse = new House("yellow");
        House anotherHouse = madhurHouse;
        System.out.println(anotherHouse.getColor());

        House ashuHouse = new House("green");
        anotherHouse = ashuHouse;
        System.out.println(anotherHouse.getColor());

        new House("red");  // garbage collector of jaa automatically deletes this

        House newHouse;
        newHouse = new House("BLACK");





    }
}