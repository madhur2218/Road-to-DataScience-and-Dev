//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            LPAstudent student = new LPAstudent(
                    i,switch(i){
                        case 1 -> "madhur";
                        case 2 -> "adarsh";
                        case 3 -> "ashu";
                        case 4 -> "akash";
                        default -> "unknown";
            }, "22/10/2000", "10"
            );

            System.out.println(student);
        }

        Student pojoStudent = new Student("Java", "22/2/2023",1, "madhur");
        LPAstudent recordStudent = new LPAstudent(2, "naman","22/2/2023", "Java");

        System.out.println(recordStudent.name());//prints the name
        System.out.println(recordStudent.dateofbirth());

        //NOTE: WE CANNOT SET VALUE IN RECORD ONLY GET VALUE
        

    }
}