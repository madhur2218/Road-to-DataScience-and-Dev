//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for(int i =0; i<5; i++){
            Student s = new Student(
                    "230230DS"+i,
                    switch(i){
                      case 1 -> "mary";
                      case 2 -> "john";
                      case 3 -> "ayush";
                      case 4 -> "ayishi";
                      case 5 -> "ashu";
                        default -> "no idea";
                    }, "02/11/2023","Java MASTER CLASS"
            );

            System.out.println(s.toString());

            System.out.println("hello" + 1);
        }
    }
}