//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
            Student s = new Student("1"+i,
                    switch(i){
                case 1 -> "Marty";
                case 2 -> "Madhur";
                case 3 -> "Ashu";
                case 4 -> "Malhar";
                case 5 -> "Naman";
                default -> "Unknown";},"11/02/2024","JavaMasterclass");
            System.out.println(s);
        }

    }
}