//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello" + "World";
        helloWorld.concat("And goodbye");

        StringBuilder helloWorldBuilder  = new StringBuilder("Hello"+ "World");
        helloWorldBuilder.append(" and goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(15));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        StringBuilder s = new StringBuilder("Hello");
        s.deleteCharAt(0).insert(0,'h');
        s.replace(2,4,"");
        System.out.println(s);


        printInformation(emptyStart);
        printInformation(emptyStart32);





    }

    public static void printInformation(String s){
        System.out.println("String = "+ s);
        System.out.println("String = "+ s.length());
    }

    public static void printInformation(StringBuilder s){
        System.out.println("String = "+ s);
        System.out.println("String length= "+ s.length());
        System.out.println("String capacity = "+ s.capacity());

    }
}