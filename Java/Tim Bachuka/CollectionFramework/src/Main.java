import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //ArrayList
        ArrayList<String> students = new ArrayList();
        students.add("Raman");
        students.add("Madhur");

        System.out.println(students);

        students.add(0,"naman");
        System.out.println(students);

        List student2 = new ArrayList<>();
        student2.add("Malhar");
        student2.add("Naveen");

        students.addAll(student2);
        System.out.println("student list contains " + students);

        System.out.println(students.getFirst());
        System.out.println(students.getLast());

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        System.out.println("Number list is " + numberList);

        numberList.remove(1);
        System.out.println(numberList);
        numberList.remove(Integer.valueOf(3));
        System.out.println(numberList);

        numberList.clear();
        System.out.println(numberList);

        System.out.println(numberList.contains(12));


        for(int i = 0 ; i < numberList.size(); i++){
            System.out.println("Values are : " + numberList.get(i));
        }

        for(Integer i : numberList){
            System.out.println("Values are: " + i);
        }

        Iterator<Integer> it = numberList.iterator();
        while(it.hasNext()){
            System.out.println("Iterator" + it.next());
        }


        //Stack
        Stack<String> s1 = new Stack<>();
        s1.add("madhur");
        s1.add("naman");
        s1.push("malhar");
        System.out.println("value of stack is " + s1);

        System.out.println(s1.peek());  // first element in stack
        System.out.println(s1.pop());  //removes first element on stack
        System.out.println(s1);


        //Queue
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(12);   //Inserting elements in queue
        q1.offer(23);
        q1.offer(3412);
        q1.offer(311);
        q1.offer(980);

        System.out.println("queue is "+ q1);

        System.out.println(q1.poll()); //Poll removes the element from Queue
        System.out.println(q1);
        System.out.println(q1.peek());

        //We can also use add() to add elements and remove() to remove elements from Queue
        //LinekdList can be implemented as an ArrayList as well as a Queue, it implements both Interfaces

        //Priority Queue

        Queue<Integer> pq = new PriorityQueue<>(); //Follows concept of Min heap
        pq.offer(12);
        pq.offer(213);
        pq.offer(213);
        pq.offer(213);
        pq.offer(213);
        pq.offer(213);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());


        Queue<Integer> pq_maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        pq_maxHeap.offer(12);
        pq_maxHeap.offer(213);
        pq_maxHeap.offer(213);
        pq_maxHeap.offer(213);
        pq_maxHeap.offer(213);
        pq_maxHeap.offer(213);
        System.out.println(pq_maxHeap);


        //HashSet

        HashSet<Integer> h1 = new HashSet<>();
        h1.add(12);
        h1.add(23);
        h1.add(34);
        h1.add(54);
        h1.add(54);

        System.out.println("Values is net is " + h1);

        h1.remove(54);
        System.out.println(h1);

        System.out.println(h1.contains(100));

        System.out.println(h1.isEmpty());
        System.out.println(h1.size());

        //LinkedHashSet - Insertion order is preserved and duplicates are allowed

        Set h2 = new LinkedHashSet();
        h2.add(23);
        h2.add(43);
        h2.add(32);

        System.out.println(h2);

        //TreeSet - stores values in sorted order
        Set h3 = new TreeSet(Comparator.reverseOrder());
        h3.add(43);
        h3.add(12);
        h3.add(54);

        System.out.println(h3);


        Set<Student> class1 = new HashSet<>();

        class1.add(new Student(12,"MADHUR"));
        class1.add(new Student(12,"MADHUR"));
        System.out.println(class1);


        //Maps - used to store key-value pair
        //Keys are unique and values are not unique

        Map<String,Integer> m1 = new HashMap<>();
        m1.put("one",1);
        m1.put("two",2);
        m1.put("three",3);
        m1.put("four",4);
        m1.put("five",4);
        m1.put("four",42);  //value gets overided

        if(m1.containsKey("two  ")){
            m1.put("two", 22);
        }

        //Above if condition can be written as -
        m1.putIfAbsent("two",22);  // in this case value would not get overrided
        System.out.println(m1);

        for(Map.Entry<String,Integer> e : m1.entrySet()){
            System.out.println("Keys " + e.getKey() + " Values "+ e.getValue());
        }

        for(String s : m1.keySet()){
            System.out.println(s);
        }

        for(Integer i : m1.values()){
            System.out.println(i);
        }


        //TreeMap  - stores data key-value pair in alphabetical order of keys

        Map m2 = new TreeMap();
        m2.put(2,"two");
        m2.put(3,"three");
        m2.put(1,"one");
        m2.put(0,"zero");

        System.out.println(m2);
        m2.remove(2);
        System.out.println(m2);

       //ArraysClass

        Integer a[] = {2,32,11,54,65,34,21,45,65};  //Sorting of array
        Arrays.sort(a);

        for(Integer i : a){
            System.out.println(i);
        }


        //Binary Search
        int []numbers = {1,2,3,4,5,6};
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index is " + index);

        //Collections Interface

        List l1 = new ArrayList();
        l1.add(23);
        l1.add(43);
        l1.add(1);
        l1.add(2);
        l1.add(100);

        System.out.println(Collections.max(l1));
        System.out.println(Collections.min(l1));
        System.out.println(Collections.frequency(l1,23));
        Collections.sort(l1,Comparator.reverseOrder());



        ArrayList class2 = new ArrayList();
        class2.add(new Student(10,"MADHUR"));
        class2.add(new Student(52,"malhar"));
        class2.add(new Student(32,"ishant"));
        class2.add(new Student(12,"naman"));

        System.out.println(class2);








    }
}