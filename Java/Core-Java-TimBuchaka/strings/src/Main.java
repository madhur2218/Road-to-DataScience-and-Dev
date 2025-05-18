//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printInformation("");
        String helloWorld = "Hello World";
        System.out.println("Index of o is: " +helloWorld.indexOf('o'));

        System.out.println("Index of world : " +helloWorld.indexOf("World"));
        System.out.println("Index of l: "+ helloWorld.indexOf('l'));
        System.out.println("Index of l: "+ helloWorld.lastIndexOf('l'));
        System.out.println("Index of l: "+ helloWorld.lastIndexOf('l',3));

        String nameUpperCase = "MADHUR";
        String namelowerCase = "madhur";

        if(nameUpperCase.equals(namelowerCase)){
            System.out.println("String match");
        }
        if(namelowerCase.equalsIgnoreCase(nameUpperCase)){
            System.out.println("String match including case");
        }

        if(namelowerCase.startsWith("mad")){
            System.out.println("String starts with mad");
        }

        if(namelowerCase.endsWith("r")){
            System.out.println("Ends with r");
        }

        if(namelowerCase.contains("m")){
            System.out.println("String contains m");
        }

        if(namelowerCase.contentEquals("m")){   //contentEquals is more specific to string builder and not to normla string
            System.out.println("String contains m");
        }

    }

    public static void printInformation(String s){
        int length = s.length();
        System.out.println("Length is: "+ s.length());

        if(s.isEmpty()){
            System.out.println("String is empty");
            return;
        }

        if(s.isBlank()){
            System.out.println("String is blank");
            return;
        }
        System.out.println("First character is: "+ s.charAt(0));
        System.out.println("Last character is: "+ s.charAt(length-1));


    }
}