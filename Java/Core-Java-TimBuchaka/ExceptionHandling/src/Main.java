import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            int number = Integer.parseInt("hello");
            System.out.println("success fully executed try block");
        }
        catch (Exception e ) {
            System.out.println("In catch block");
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("End of prog");
        }

    }
}