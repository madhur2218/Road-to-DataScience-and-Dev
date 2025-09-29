import java.util.*;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List a = new ArrayList();
        a.add("A");
        System.out.println(a.get(0));

        Student madhur = new Student("MADHUR",23,"444444444");
        Student ashu = new Student("ashutosh",1,"22342");
        Student adarsh = new Student ("adarsh", 112,"323423");

        List<Student> studentList = new ArrayList<>();
        studentList.add(madhur);
        studentList.add(ashu);
        studentList.add(adarsh);

        System.out.println(studentList.get(0).getClass());

        //String [] names = {"Madhur","ashu","adarsh"};
        //studentList.addAll(Arrays.asList(names));

        studentList.removeIf(student -> student.getName().charAt(0) == 'G');




        List <Student> linkedListStudent = new LinkedList();
        linkedListStudent.add(ashu);
        linkedListStudent.add(adarsh);
        System.out.println(linkedListStudent.get(0));

        Stack<Student> stackStudent = new Stack();
        stackStudent.add(ashu);
        stackStudent.add(adarsh);
        stackStudent.push(ashu);
        stackStudent.push(adarsh);
        System.out.println(stackStudent.peek());

        Set <Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set);

    Collection<String> collectionInterface = new TreeSet<>();
    collectionInterface.add("A");
    collectionInterface.add("B");


    }
}