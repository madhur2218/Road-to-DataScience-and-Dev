import javax.security.auth.Subject;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List<Integer> al1 = new ArrayList();
        ArrayList<Integer> al1 = new ArrayList();
        al1.add(12);
        al1.add(55);
        al1.add(45);

        System.out.println(al1); //prints whole arraylist
        System.out.println(al1.get(2)); //prints 3rd element
        System.out.println(al1.size()); // prints size of arraylist

        //Iterating over each object
        for(int i =0; i<al1.size(); i++){
            System.out.println(al1.get(i) + ".");
        }

        //Iterating over collection object
        for(int i: al1){
            System.out.println(i);
        }

        //add,remove,contains
        List<Integer> rollNums = new ArrayList<>();
        rollNums.add(111);
        rollNums.add(123);
        rollNums.add(567);
        rollNums.add(4578);
        rollNums.add(129);

        System.out.println(rollNums.contains(111));
        System.out.println(rollNums.size());
        System.out.println(rollNums.get(0));
        System.out.println(rollNums.remove(4));
        rollNums.add(4,130);
        System.out.println(rollNums);

        rollNums.set(4,131);
        System.out.println(rollNums);

    for(int i=0;i<rollNums.size();i++){
       System.out.println(rollNums.get(i));
    }

    for(int i : rollNums){  //iterates over object directly
            System.out.println(i);
        }
        rollNums.add(0,1);
        System.out.println(rollNums);

        //Creating arraylist of Students
        List<Subjects> sub1 = new ArrayList<>(Arrays.asList(new Subjects("eng"),new Subjects("hind")));
        List<Subjects> sub2 = new ArrayList<>(Arrays.asList(new Subjects("eng"),new Subjects("hind")));
        List<Subjects> sub3 = new ArrayList<>(Arrays.asList(new Subjects("eng"),new Subjects("hind")));
        Students s1 = new Students("madhur",12,160.00d,sub1);
        Students s2 = new Students("naman",13,180.00d,sub2);
        Students s3 = new Students("ashu",14,179.00d,sub3);

        List<Students>studList = new ArrayList<>();
        studList.add(s1);
        studList.add(s2);
        studList.add(s3);

        System.out.println(studList.getClass().getName());
//
//        for(Object student: studList){
//            System.out.println(student);
//        }

        for(Students student: studList){
            System.out.println(student);
        }

        //Arrays.asList -> Array to List
        List<String> names = Arrays.asList("MADHUR","ASHUTOSH");
        System.out.println(names.getClass().getName());
        names.set(0,"ISHANT");
        System.out.println(names);

        for(String name:names ){
            System.out.println(name);
        }
        //names.add(0,"malhar");// throws exception
        //Arrays.asList() does not create a regular ArrayList. Instead, it returns a fixed-size list backed by an array.
        List<String> names_add = new ArrayList<>(Arrays.asList("MADHUR","ASHUTOSH"));
        names_add.add(0,"malhar");
        System.out.println(names_add);

        List<String> list1 = List.of("MADHUR","ISHANT","NAMAN");
        System.out.println(list1.getClass().getName());
        System.out.println(list1);

        Fruits f1 = new Fruits("apple",1);
        Fruits f2 = new Fruits("mango",3);

        List<Fruits> myFruits = new ArrayList<>(Arrays.asList(f1,f2));
        System.out.println(myFruits);


        //Various ways of creating arrayList
//        List a1 = new ArrayList();
//        ArrayList a2 = new ArrayList();
//        List a3 = new ArrayList(Arrays.asList());
//        List a4 = List.of();

        /*
         * LinkedList starts here:
         */

        LinkedList<Integer> node1 = new LinkedList<>();
        //add/remove/update
        node1.add(10);
        node1.add(20);
        node1.add(30);

        System.out.println("linked list elements are: " +node1);

        node1.remove(0);
        System.out.println("linked list elements are: " +node1);

        //node1.removeIf(x->x%2==0);
        //System.out.println(node1);

        node1.removeFirst();
        node1.removeLast();

        node1.addFirst(10);
        node1.addLast(20);
        System.out.println( node1.get(1));
        System.out.println(node1.getClass().getName());

        node1.set(0,55);
        System.out.println(node1);

        LinkedList<Fruits> fruitsLinkedList = new LinkedList<>(Arrays.asList(f1,f2));
        System.out.println(fruitsLinkedList);

        /*
         * Map starts here:
         */


























    }
}