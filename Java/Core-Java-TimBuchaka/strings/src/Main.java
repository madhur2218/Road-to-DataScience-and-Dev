//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printInformation("MADHUR");
        printInformation("");
        printInformation("  ");


    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("length of string is %d %n", length);
        if(string.isEmpty()){
            System.out.println("String is empty and length is "+ string.length());
            return;
        }
        else if (string.isBlank()) {
            System.out.println("String is blank");
        }

        //System.out.println("length of string is %d"+ length);
        System.out.printf("First character is %c %n", string.charAt(0));
        System.out.println("Last character of string is "+ string.charAt(length-1));

//        for(int i=0; i<=string.length();i++){
//            System.out.println(string.charAt(i));
//        }



    }

}