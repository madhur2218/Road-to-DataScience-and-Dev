public class PracticeStrings {

    public static void main(String[] args) {

        //this is string builder andstring buffer practice
        String s = "hello world";
        s.concat("and goodbye world");

        printInformation(s);

        StringBuilder sb = new StringBuilder("hello world");
        sb.append(" and goodbye world ");
        printInformation(sb);

        StringBuilder emptyStart  = new StringBuilder();
        emptyStart.append("hello world".repeat(12));
        printInformation(emptyStart);




    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());

    }


    public static void printInformation(StringBuilder stringBuilder) {
        System.out.println("String = " + stringBuilder);
        System.out.println("length = " + stringBuilder.length());
    }

}
