public class ParsingValuesAndReadingInputData {
    public static void main(String[] args) {

        int anotherYear = 2021;

        int currentYear= 2024;
        int dob = Integer.parseInt("2000"); //Class integer calling a static method integer
        System.out.println(currentYear-dob);

        String myAge = "23.22";
        double actualAge = Double.parseDouble(myAge);
        System.out.println(actualAge);


        System.out.println(getInputFromConsole(anotherYear));
        System.out.println(getInputFromConsole(anotherYear));

    }

    public static String getInputFromConsole(int anotherYear){
        String name = System.console().readLine("Hi, what is your name?");
        System.out.println("hi" + name+ "thank for taking this course");

        String dob= "2000";
        int age= Integer.parseInt(dob);
        return "SO YOU ARE" +age + "old";
    }

    public static String getInputFromScanner(int anotherYear){
        return "";
    }


}
