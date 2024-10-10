//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse=blueHouse;

        System.out.println(blueHouse.getColour());
        System.out.println(anotherHouse.getColour());

        anotherHouse.setColour("yellow");
        System.out.println(blueHouse.getColour());
        System.out.println(anotherHouse.getColour());


        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(greenHouse.getColour());
        System.out.println(anotherHouse.getColour());


        new House("Red"); //creating an object but not assigning any reference. House gets created in memory
        House newHouse = new House ("beige"); //created object of this in memeory and reference is assigned to it.

    }
}
