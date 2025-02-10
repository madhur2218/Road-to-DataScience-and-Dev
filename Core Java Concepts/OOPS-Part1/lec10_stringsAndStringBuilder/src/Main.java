//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "madhur";
        System.out.println("Person name is "+ name);

        int age = 25;
        System.out.printf("Person last name is %s\n" ,age);

        int yearOfBirth = 2025;
        System.out.printf("Age = %d, birthYear = %d\n", age,yearOfBirth);

        String s = """
                this is a block of string  """;

        System.out.println("............................");

        printInformation("Madhur");
        printInformation("");
        printInformation(" ");

        String helloWorld = "Hello World";
        printInformation(helloWorld);

        System.out.println("............................");

        String helloWorldLower = helloWorld.toLowerCase();

        if(helloWorld.equals(helloWorldLower)){
            System.out.println("values match exactly");
        }
        else{
            System.out.println("values do not match exactly");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("matches");
        }

        if(helloWorld.endsWith("World")){
            System.out.println("ends with world and matches");
        }

        if(helloWorld.contains("W")){
            System.out.println("Contains W");
        }

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Content of both strings is equal");
        }

    }

    public static void printInformation(String string){
        int length = string.length();

        if(string.isEmpty()){
            System.out.println("string is empty");
            return; //If this code is inside a void method, return will immediately exit the method and control will be handed back to the caller.
        }

        if(string.isBlank()){
            System.out.println("string is blank");
            return;
        }


        System.out.printf("length = %d %n" ,length);
        System.out.printf("first character = %c \n", string.charAt(0));
        System.out.printf("last character = %c\n", string.charAt(length-1));
        System.out.println("Index of character r is at "+ string.indexOf('r'));
        System.out.println("Index of character r is at "+ string.indexOf('l'));
        System.out.println("Index of character r is at "+ string.lastIndexOf('l',3));



    }
}