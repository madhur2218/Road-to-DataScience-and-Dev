import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        //HashSet
        //LinkedHashSet

        Set<Integer> l1 = new HashSet<>(100);
        l1.add(12);
        l1.add(34);
        l1.add(123);
        l1.add(324);
        l1.add(124);
        System.out.println(l1);

        HashSet<Object> hs1= new HashSet<>(l1);  //default capacity is 16 and loac factor is 0.75

        ArrayList a1 = new ArrayList(l1);


        Collections.sort(a1);
        System.out.println(a1);

        HashSet<Integer> hs2= new HashSet(100,(float)0.95);

        //Adding elements into HashSet
        hs2.add(32);
        hs2.add(21);
        hs2.add(546);
        hs2.add(12);
        System.out.println("Intial values" + hs2); //insertion order not preserved

        hs2.remove(32);
        System.out.println(hs2);

        //checking if value is present in hashset or not
        System.out.println(hs2.contains(32));
        //System.out.println("checking values " + hs2);

        //Check if hashset is empty or not
        System.out.println(hs2.isEmpty());

        //forEACH
        for(Integer o :hs2 ){
            System.out.println(o);

        }

        //Iterator
        Iterator<Integer> i = hs2.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


        System.out.println("Add all and remove all methods for hashset");

        HashSet evennumbers = new HashSet();
        evennumbers.add(2);
        evennumbers.add(4);
        evennumbers.add(6);

        HashSet numbers = new HashSet();
        numbers.addAll(evennumbers);

        numbers.add(10);
        System.out.println(numbers);


        numbers.removeAll(evennumbers);
        System.out.println(numbers);

        //Union,Intersection and Difference in sets
        HashSet<Integer> set1 = new HashSet();
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(8);
        set1.add(10);
        set1.add(1);

        HashSet<Integer> set2 = new HashSet();
        set2.add(1);
        set2.add(3);
        set2.add(5);
        set2.add(7);
        set2.add(9);

        System.out.println("Hashset1 " + set1);
        System.out.println("Hashset2 + " + set2);

        //Union operation
        set1.addAll(set2);
        System.out.println("union is " + set1);

        //Intersection- common elements in both sets
        set1.retainAll(set2);
        System.out.println("intersection is "+ set1.retainAll(set2));

        //Difference between two sets
        set1.removeAll(set2);
        System.out.println("differenceis "+ set1);
        System.out.println(set1);

        //Subset
        System.out.println(set2.containsAll(set1));
        System.out.println("subset : " + set2 );



    }
}
