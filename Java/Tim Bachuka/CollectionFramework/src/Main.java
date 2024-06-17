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




    }
}