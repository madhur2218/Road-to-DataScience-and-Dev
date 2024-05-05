import java.sql.SQLOutput;
import java.util.Scanner;

public class ParsingValuesAndReadingInputData {
    public static void main(String[] args) {

        int anotherYear = 2021;

        int currentYear= 2024;
        int dob = Integer.parseInt("2000"); //Class integer calling a static method integer
        System.out.println(currentYear-dob);

        String myAge = "23.22";
        double actualAge = Double.parseDouble(myAge);
        System.out.println(actualAge);

        try {
            System.out.println(getInputFromConsole(anotherYear));
        }catch (NullPointerException e ) {
            System.out.println(getInputFromScanner(anotherYear));
        }

    }

    public static String getInputFromConsole(int anotherYear){
        String name = System.console().readLine("Hi, what is your name?");
        System.out.println("hi" + name+ "thank for taking this course");

        String dob= "2000";
        int age= Integer.parseInt(dob);
        return "SO YOU ARE" +age + "old";
    }

    public static String getInputFromScanner(int anotherYear){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi what is your name");
        String name = sc.nextLine();
        System.out.println("Hi "+ name+  " thank for taking this course" );

        String dob= "20";
        int age = Integer.parseInt(dob);
        return "SO YOU ARE " +age + " old";
    }


}
