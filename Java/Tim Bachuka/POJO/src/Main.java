import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Student s1 = new Student("2", "madhur", "22/2/23","3");
        System.out.println(s1);

        for(int i=1;i<=5;i++){
            LPAStudent s = new LPAStudent("001"+i,
                    switch(i){
                        case 1 -> "madhur";
                        case 2 -> "ashu";
                        case 3 -> "malhar";
                        case 5 -> "naman";
                        default -> "anonoymous";
            } , switch(i){
                case 1 -> "22/32/12";
                case 2 -> "12/53/23";
                case 3 -> "65/234/23";
                case 5 -> "45/234/22";
                default -> "unknown";
                }, "Java mASTER CLASS"
            );

            System.out.println(s);
        }

        Student pojoStudent = new Student("1", "MADHUR", "22/10/2000","123");
        LPAStudent recordStudent = new LPAStudent("2","malhar", "20/12/34","432");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName()+ " is taking" + pojoStudent.getClass());

        System.out.println(recordStudent.name()+ " is taking" + recordStudent.classList());




    }
}