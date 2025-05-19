public class StringBuilderr {
    public static void main(String[] args) {
        //String is immutable and each method call returns a new instance of string
        //StringBuilder is mutable and does not create object everytime
        //We cannot assign string literal to stringBuilder
        //Character sequence in string builder changes
        //String create a new object in memory and return the reference of this new object
        //String Builder return a stringBuilder reference but is really a self reference
        //Some more methods in StringBuilder: .append, .charAt, .insert, . replace, .reverse, .setLength

        String helloWorld = "Hello" + "World";
        helloWorld.concat(" madhur");

        StringBuilder builder = new StringBuilder("Hello" + "World");
        builder.append(" Madhur");

        StringBuilder s1 = new StringBuilder(32);
        StringBuilder s2= new StringBuilder();
        s2.append("a".repeat(10));
        printInformation(s2);
        //printInformation(s2);

        StringBuilder names = new StringBuilder("madhur" + " naman"+ " malhar");
        names.append(" ishant");
        printInformation(names);

        StringBuilder sc = new StringBuilder("hello world ! this is programming");
        sc.append(" i am learning java");
        printInformation(sc);

    }

    public static void printInformation(String s){
        System.out.println("String: "+ s);
        System.out.println("Length: "+s.length());
    }

    public static void printInformation(StringBuilder s){
        System.out.println("String: "+ s);
        System.out.println("Length: "+s.length());
        System.out.println("Capacity: "+ s.capacity());
    }
}
