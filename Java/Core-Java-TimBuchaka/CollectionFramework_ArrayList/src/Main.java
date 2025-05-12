import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Collection framework - ArrayList
        ArrayList <String> names = new ArrayList<>();

        //Addition, removal, updation, deletion

        //Printing empty string
        System.out.println(names.size());

        //Adding values
        names.add("madhur");
        names.add("garvita");
        names.add("arshya");
        names.add("pranati");

        for(String s : names){
            System.out.println(s);
        }

        System.out.println(names);

        //Adding element at specific index
        names.add(4,"ashutosh");
        System.out.println(names);

        //Fetching element at specific index
        System.out.println(names.size());
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(2));

        names.remove("ashutosh");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);

       names.add(3,"garvita");
        int lastIndexOfObject = names.lastIndexOf("garvita");
        System.out.println(lastIndexOfObject);

        //Contains
        System.out.println(names.contains("garvita"));

        //Check if list is empty of not
        System.out.println(names.isEmpty());

        //Size of list
        System.out.println(names.size());

        //subList()
        System.out.println(names.subList(0,2));

        //clear() list
        names.clear();
        System.out.println(names);


        //Student object
        ArrayList<Student> s1 = new ArrayList<>();

        Student madhur = new Student("Madhur",18);
        Student garvita = new Student("Garvita",33);

        s1.add(madhur);
        s1.add(garvita);
        System.out.println(s1);

        //Animal Class arraylist objects
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal(12, new ArrayList<>(Arrays.asList("black","brown")),"zoey","libra" ));
        animals.add(new Animal (11,new ArrayList<>(Arrays.asList("green,blue")), "ashu","libra"));

        System.out.println(animals);

        for(Animal i: animals){
            System.out.println(i);
        }


        //Different ways of creating array list
        List num1 = new ArrayList();
        ArrayList num2 = new ArrayList();

        List<String> list1 = Arrays.asList("MONDAY", "TUESDAY");
        //list1.add("WEDNESDAY");   // WE CANNOT REMOVE OR ADD A NEW VALUE WHILE USING Arrays.asList but can update one
        list1.set(0,"Sunday");
        System.out.println(list1.getClass().getName());

        ArrayList<String> list2 = new ArrayList<>();
        System.out.println(list2.getClass().getName());

        String[] list3 = {"MONDAY", "TUESDAY"};
        List list4 = Arrays.asList(list3);
        System.out.println(list4.getClass().getName());
        System.out.println(list3.getClass().getName());

        List list5 = List.of(1,2,3,4,5);
        //list5.add(4);    this is an unmodifiable list

        List list6 = new ArrayList(list5);
        list6.add(4);

        for(Object i : list6){
            System.out.println(i);
        }


        //

        List<String> list7 = new ArrayList<>();
        list7.add("monday");
        list7.add("tuesday");
        list7.add("wednesday");
        list7.remove("wednesday");


        List<Integer> list8 = new ArrayList<>();
        list8.add(124234);
        list8.add(22345432);
        list8.add(342523);
        //list8.remove(1);
        list8.remove(Integer.valueOf(22345432));
        System.out.println(list8);

        List<Object> list9 = new ArrayList<>();
        list9.add("2");
    }
}