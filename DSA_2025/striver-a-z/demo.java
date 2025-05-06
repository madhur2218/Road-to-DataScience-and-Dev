import java.sql.Array;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        //Contains Duplicates and in ordered collection, indexed based access
        //Arraylist changes size dynamically
        int arr[] = new int[10];

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(10);

        System.out.println(list.get(0));
        System.out.println(list.size());

        for(int i=0; i<list.size();i++){    // using pointer to iterate over object
            System.out.println(list.get(i));
        }

        for(int i : list){    // iterating directly over collection objects
            System.out.println(i);
        }

        List<Integer> rollNumber = new ArrayList<>();
        rollNumber.add(10);
        rollNumber.add(20);
        rollNumber.add(30);
        for(int i: rollNumber){
            System.out.println(i);
        }

        System.out.println(rollNumber.contains(10));
        System.out.println(rollNumber.contains(60));
        System.out.println(rollNumber.size());
        System.out.println(rollNumber.get(0));
        rollNumber.remove(0);
        System.out.println(rollNumber);

        rollNumber.add(0,10);

        for(int i :rollNumber){
            System.out.println(rollNumber);
        }

        rollNumber.set(0,100); //replaces value at a particular index
        System.out.println(rollNumber);

        rollNumber.set(0,400);
        for(int i : rollNumber){
            System.out.println(rollNumber);
        }

        //Creating arraylist of Students
        Student s1 = new Student("madhur", 18,"madhur@gmail.com");
        Student s2 = new Student("ashu", 19,"ashu@gmail.com");
        Student s3 = new Student("malhar", 20,"malhar@gmail.com");

        List studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        for(Object student: studentList){
            System.out.println(student);
        }

        ArrayList<Integer> a1 = new ArrayList();
        for(int i=0;i<11;i++){
            a1.add(1);
        }
        System.out.println(a1);

        //Arrays.asList
        List<String> arr1= Arrays.asList("madhur","ishant");
        System.out.println(arr1);
        System.out.println(arr1.getClass().getName());
        arr1.set(1,"naman");
        System.out.println(arr1);
        //arr1.add("nasha"); this will throw an exception

        String array[] = {"madhur","ishant","malhar","naman"};
        List<String> names = Arrays.asList(array);
        //names.add("shreya"); this line throws exception
        //we can replace velues only in arrays.aslist, cannot add or remove element
        System.out.println(names.getClass().getName());

        List<Integer> listOf = List.of(1,2,3,4,5);
        System.out.println(listOf);

        //Nested list of student with subjects
        List <Subjects> subjects1 = Arrays.asList(new Subjects("english"),new Subjects("hindi"));
        List <Subjects> subjects2 = Arrays.asList(new Subjects("english"),new Subjects("hindi"));

        Student madhur = new Student("madhur",12,"madhur@gmail.com", subjects1);

        List<String> fruit1 = new ArrayList<>();
        fruit1.add("apple");
        fruit1.add("banana");
        fruit1.add("melon");
        System.out.println(fruit1.getClass().getName());

        List<String> fruit2 = new ArrayList<>(fruit1);
        fruit2.add("apple");
        fruit2.add("banana");
        fruit2.add("melon");

        List<String> fruit3 = new ArrayList<>(fruit2);
        fruit3.add("apple");
        System.out.println(fruit3);
        fruit2.addAll(fruit1);

        List rollNums = Arrays.asList(1,2,3,4,5);
        //rollNums.remove(2);
        //rollNums.remove(Integer.valueOf(1));

        //Converting list to array
        List numbers = new ArrayList();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);

        //Object[] arrayObj = numbers.toArray();
        //Integer[] intArr = numbers.toArray(new Integer[0]);  -- doubt

        //Sorting arraylist and Comparator interface
        List<Integer> sorting = new ArrayList<>();
        sorting.add(29);
        sorting.add(1);
        sorting.add(42);
        sorting.add(11);

        System.out.println(sorting);

//        sorting.sort(null);
//        System.out.println(sorting);
        Collections.sort(sorting);
        System.out.println(sorting);

        //Comparator
        List<Integer> comparatorEx = new ArrayList<>();
        comparatorEx.add(29);
        comparatorEx.add(1);
        comparatorEx.add(42);
        comparatorEx.add(11);

        comparatorEx.sort(null);
        comparatorEx.sort(new IntegerLengthComparator());
        System.out.println(comparatorEx);

        //comparator compares 2 objects of same type

        List nos = Arrays.asList(2,1,5,6);
        nos.sort(null);  //Asc order
        System.out.println(nos);
        nos.sort(new IntegerLengthComparator()); //desc order
        System.out.println(nos);

        List words = Arrays.asList("watermelon","banana","mango");
        words.sort(new StringLengthComparator());
        System.out.println(words);

        List <AnotherStudent> anotherStudent = new ArrayList<>();
        anotherStudent.add(new AnotherStudent("Madhur",4.00));
        anotherStudent.add(new AnotherStudent("Malhar",4.99));
        anotherStudent.add(new AnotherStudent("Ashu",2.13));

        anotherStudent.sort((o1,o2) -> {
            if(o2.getGpa() - o1.getGpa() >0){
                return 1;
            } else if (o2.getGpa() - o1.getGpa() <0) {
                return -1;
            }
            else {
                return 0;
            }
        });

        for(AnotherStudent s: anotherStudent){
            System.out.println(s.getName() + " : " + s.getGpa());
        }

        System.out.println("------------------------------------------");

        //Revision of ArrayList
        













    }

}

class StringLengthComparator implements Comparator <String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}

class IntegerLengthComparator implements Comparator <Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1 ;
    }
    //  2 1 5 6
}

// Iterable -> Collection -> LIST(ArrayList, LinkedList, Stack), SET(HasSet, LinkedHashset, TreeSet, EnumSet), QUEUE(LinkedList, PriorityQueue, Deque)
