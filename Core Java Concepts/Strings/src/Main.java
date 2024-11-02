public class Main {
    public static void main(String[] args) {
        printInformation("");
        printInformation("\t \n");

        String helloMadhur = "Hello Madhur";
        System.out.printf("Index of l = %d %n ", helloMadhur.lastIndexOf("l"));
        System.out.printf("Index of l = %d %n ", helloMadhur.indexOf("l"));

        if(helloMadhur.toLowerCase().equals("hello madhur")){
            System.out.println("values match exactly");
        }

    }

    public static void printInformation(String string){
        int length = string.length();
        if(string.isEmpty()){
            System.out.print("String is empty");
            return;
        }
        if(string.isBlank()){
            System.out.println("String is blank");
            return;
        }
        System.out.printf("Length = %d %n", length);
        System.out.printf("First character = %c %n", string.charAt(0));
        System.out.printf("Last character = %c %n", string.charAt(length-1));


    }
}