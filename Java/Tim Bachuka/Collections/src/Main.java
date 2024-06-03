import java.util.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Collections include arrays,lists,dictionaries, sets,maps,vectors,queues,tables etc.
        //Arrays and array utilities are not considered part of collection
        //Maps do not implements collection framework
        //ArrayList vs TreeSet vs HashSet

        //list.sort(); will get error as collection interface does not have sort method
        //LinkedList implements both List and Dequeue
        //Sets do not contain duplicate element - HashSet, TreeSet and LinkedHashset
        //Map stores key-value pairs - Keys are set and Values are separate collection - keys are unique and values are not unique
        //Elements in a tree are also stored in key-value node called as an Entry

        List l1 = new ArrayList();
        List<String> l2 = new ArrayList<>();

        //Adding new elements to arraylist
        l2.add("ashu");
        l2.add("madhur");
        System.out.println(l2);

        l1.add(21);
        l1.add("madhur");
        l1.add("ishant");
        l1.add("malhar");
        l1.add(12.341);
        l1.add('a');
        l1.add(true);
        System.out.println(l1);
//
//        for(int i=0; i<l1.size();i++){
//            System.out.println(l1);
//        }

        //Checking size of arraylist
        System.out.println(l1.size());

        //Removing element
        l1.remove(1);  // this is by directly passing a value
        l1.remove("malhar"); // this is by directly passing an object

        System.out.println("After removing elements " + l1 );

        l1.add(1, "madhur");  //adding an element on a specific index else it adds on last of my index
        l1.add("naman");

        System.out.println(l1);

        //Retrieving an element from array
        System.out.println( l1.get(2));

        //Replace element in array
        l1.set(1,"java");
        System.out.println(l1);

        //Searching an element in arraylist - contains() - returns T or F
        System.out.println(l1.contains("c#"));

        //Tells if arraylist is empty or not - isEmpty() - returns T or F
        System.out.println(l1.isEmpty());


        //for loop
        System.out.println("Reading elements by forloop");
        for(int i=0; i<l1.size();i++){
            l1.get(i);
        }


        //foreach loop
        System.out.println("reading elements by foreach");

        for(Object j : l1){
            System.out.println(j);

        }

        //iterator()
//        Iterator <String> it = l1.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }


            List l3 = new ArrayList<>();
        l3.add(43);
        l3.add(134);
        l3.add(65);
        l3.add(3465);
       // l3.add("madhur");

        List l4 = new ArrayList();
        l4.addAll(l3);

        l4.removeAll(l3);
        System.out.println("values in l3 is " + l3);


        System.out.println("values in l4 is  "+ l4);

        //Soring
        Collections.sort(l3,Collections.reverseOrder());
        System.out.println(l3);

        Collections.reverse(l3);
        System.out.println(l3);
        Collections.reverseOrder();

        //Shuffling
        Collections.shuffle(l3);
        System.out.println(l3);


        Object arr[] = {2,3,4,1,32,3, "madhur"};

        for(Object o : arr){
            System.out.println(o);
        }

        ArrayList<Object> a1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(a1);


        LinkedList ll= new LinkedList();
        ll.add("madhur");
        ll.add(21);
        ll.add("ashu");
        ll.add(null);
        ll.add(12.21);

        System.out.println("talking about linked list now :");
        System.out.println(ll);

        //Size of linkedlist
        System.out.println(ll.size());

        //Removing element from linkedlist
        ll.remove(1);
        ll.remove("ashu");
        System.out.println(ll);
        System.out.println(ll.size());

        //Adding inserting elements is ll
        ll.add(1,"ashu");
        ll.add("python");
        System.out.println(ll);

        //Retrieving value/object from ll

        System.out.println(ll.get(4));

        //Replacing the value
        ll.set(4, "js");  //(index, element)
        System.out.println(ll);

        //Checking if element is present or not
        System.out.println(!ll.contains("js"));
        System.out.println(!ll.isEmpty());


        //Forloop
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }

        //foreach loop
        for(Object l : ll){
            System.out.println(l);
        }



        //Iterator
        Iterator i = ll.iterator();
        System.out.println("using iterator:");
        while(i.hasNext()){
            System.out.println(i.next());

        }


        //Copying one ll to another ll1
        LinkedList ll2= new LinkedList();
        ll2.addAll(ll);
        System.out.println(ll2);

        //Soring is possible if we have only same kind of data

        LinkedList ll3 = new LinkedList();
        ll3.add(3424232);
        ll3.add(124);
        ll3.add(31234);
        ll3.add(765);
        System.out.println(ll3);

        ll3.removeAll(ll2);
        System.out.println(ll3);

        System.out.println("Before sorting"+ ll3);
        Collections.sort(ll3);
        System.out.println(ll3);

        System.out.println(Collections.max(ll3));
        System.out.println(Collections.min(ll3));
        Collections.sort(ll3,Collections.reverseOrder());
        System.out.println(ll3);

        Collections.shuffle(ll3);
        System.out.println("data after shuffling:");
        System.out.println(ll3);

        //Performing operations for Stack and Queues
        LinkedList ll4 = new LinkedList(ll3);
        ll4.add("lion");
        ll4.add("parrot");
        ll4.add("headphones");
        ll4.addFirst("computer");
        ll4.addLast("mouse");
        System.out.println(ll4);
        ll4.add(1,"charger");
        System.out.println(ll4);
        ll4.remove(1);
        System.out.println(ll4);


        //Hashmap and Map
        HashMap h2 = new HashMap();
        HashMap <Integer, String> h1 = new HashMap<>();

        h1.put(1,"madhur");
        h1.put(2,"neha");
        h1.put(2,"ashu");
        h1.put(3,"ishant");
        h1.put(4,"ashu");

        System.out.println(h1);
        System.out.println(h1.get(1));
        h1.remove(1);
        System.out.println(h1);

        System.out.println(h1.containsKey(1));
        System.out.println(h1.containsValue("ashu"));

        System.out.println(h1.isEmpty());

        System.out.println(h1.keySet());// returns keys as set collection as keys are not duplicate
        System.out.println(h1.values()); // returns values as a collection not set

        ArrayList a = new ArrayList(h1.values());
        System.out.println(a);

        h1.entrySet();

        //Entry level methods in HashMap

        for(Object o : h1.values()){
            System.out.println(o);
        }

        for(int i1  : h1.keySet()){
            System.out.println(i1);
        }

        for(String s1  : h1.values()){
            System.out.println(s1);
        }

        Iterator i2 = h1.entrySet().iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }


        //Entry level interface methods for HashMaps

        for(Map.Entry element:h1.entrySet()){
            System.out.println(element.getKey() + " " + element.getValue());
        }

        Set s1=h1.entrySet();
        Iterator i3 = s1.iterator();
        while(i3.hasNext()){
           Map.Entry entry = (Map.Entry) i3.next();
            System.out.println(entry.getKey() + " " + entry.getValue() );
        }



        //HashTable
        Hashtable ht1 = new Hashtable();
        Hashtable<Integer, String> ht2 = new Hashtable<>(12, (float)0.50);

        ht2.put(1, "ASHU");
        ht2.put(2,"madhur");
        //ht2.put(2,"mudit");
        ht2.put(3,"gillu");
        ht2.put(4,"naman");
        System.out.println(ht2);

        System.out.println(ht2.get(1));

        ht2.remove(1);
        System.out.println(ht2);

        ht2.containsKey(1);
        ht2.containsValue("ASHU"); //t OR f

        ht2.isEmpty();

        for( int o : ht2.keySet()){
            System.out.println(ht2.get(o));

        }


        //Entry specific method

        for(Map.Entry o : ht2.entrySet()){
            System.out.println(o.getKey()+ " " + o.getValue());
        }

        //Using iterator

        Set s = ht2.entrySet();
        Iterator i4= s.iterator();
        while(i4.hasNext()){
            Map.Entry entry = (Map.Entry)i4.next();
            System.out.println(entry.getKey() + " " + entry.getValue());

        }


        //LinkedHashMap












    }
}