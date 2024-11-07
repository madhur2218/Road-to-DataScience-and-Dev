public class String_Builder {
    public static void main(String[] args) {
        String helloWorld = "Hello"+"World";

        StringBuilder helloWorldStringBuilder = new StringBuilder("Hello"+"World");

        printInformation(helloWorld);
        printInformation(helloWorldStringBuilder);
    }

    public static void printInformation(String string){
        System.out.println("String is = " +string);
        System.out.println("Length of string is = "+string.length());
    }

    public static void printInformation(StringBuilder stringBuilder){
        System.out.println("String is = " +stringBuilder);
        System.out.println("Length of string is = "+stringBuilder.length());
    }
}
