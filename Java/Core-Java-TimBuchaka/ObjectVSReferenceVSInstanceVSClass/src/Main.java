//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        House h1 = new House("blue");
        House h2 = h1;

        System.out.println(h1.getClass().getName());
        System.out.println(h1.getColor());
        System.out.println(h2.getColor());

        House h3 = new House("green");
        h3=h2;
        System.out.println(h2.getColor());

        new House("red"); //this object has no reference so java garbage collection will automatically delete this

    }
}