public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String helloWorld = "Hello" + "World";
        String res= helloWorld.concat("and goodbuy");
        String res1= res.concat("today is monday");
        String res2 = res1.concat("i have to go office");
        System.out.println(res2);


        StringBuilder builder = new StringBuilder("Hello" + "World");
        builder.append("and gudbuy");
        builder.append("today is monday");
        builder.append(" i have to go office");
        builder.deleteCharAt(12).insert(4,"e");  //deletes the character and then inserts value
        builder.replace(1,3,"madhur");
        builder.reverse();
        System.out.println(builder);

        printInformation(helloWorld);
        printInformation(builder);

        StringBuilder sb1  = new StringBuilder();
        sb1.append("a".repeat(18));  // here StringBuilder will request for larger storage

        StringBuilder sb2 = new StringBuilder(32);  // here string builder will not request for larger storage
        sb2.append("a".repeat(17));

        printInformation(sb1);
        printInformation(sb2);


    }

    public static void printInformation(String str){
        System.out.println("string is  :"+ str);
        System.out.println("length of string is : "+ str.length());
    }

    public static void printInformation(StringBuilder strBuilder){
        System.out.println("string is  :"+ strBuilder);
        System.out.println("length of string is :"+ strBuilder.length());
        System.out.println("capacity = " + strBuilder.capacity());
    }
}