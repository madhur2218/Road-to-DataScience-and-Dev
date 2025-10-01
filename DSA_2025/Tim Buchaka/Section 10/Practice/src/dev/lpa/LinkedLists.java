package dev.lpa;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedLists {
    static void main() {

//        LinkedList placesToVisit = new LinkedList();
//        //var placesToVisits = new LinkedList<String>();
//
//        placesToVisit.add(null);
//        System.out.println(placesToVisit);
//
//        placesToVisit.add(2);
//        System.out.println(placesToVisit);
//        addModeElements(placesToVisit);
//        System.out.println(placesToVisit);
//
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);



        System.out.println("------------LINKED LIST SECTION----------");

        LinkedList<String> countries = new LinkedList<>();
        countries.add("Brisbane");
        countries.add("Canberra");
        countries.add("Sydney");
        countries.add("delhi");
        countries.add("Maryland");
        countries.add("Mexico");
        countries.add("San Francisco");
        System.out.println(countries);


        gettingElements(countries);
        printItinary(countries);
        printItinary2(countries);
        System.out.println("------------LINKED LIST----------");
        printItinary3(countries);

        System.out.println("USING ITERATORS------>");
        usingIterator(countries);

    }

    private static void gettingElements(LinkedList<String> countriesList) {
        System.out.println(countriesList.get(0));
        System.out.println(countriesList.get(4));

        System.out.println(countriesList.getFirst());
        System.out.println(countriesList.getLast());
        System.out.println("delhi is at position:"+ countriesList.indexOf("delhi"));

        //queue retrival method
        System.out.println("element from element:"+ countriesList.element());
        //stack retrival method
        System.out.println("element from peek:"+ countriesList.peek());
        System.out.println("element from pop:"+countriesList.pop());

    }

    private static void printItinary(LinkedList<String> countriesList){
        System.out.println("Trip starts at " + countriesList.getFirst());

        for(int i=1;i<= countriesList.size()-1;i++){
            System.out.println("--->from "+ countriesList.get(i-1)+ " to "+ countriesList.get(i));
        }
        System.out.println("Trip ends at " + countriesList.getLast());
    }

    private static void printItinary2(LinkedList<String> countriesList){
        System.out.println("Trip starts at " + countriesList.getFirst());
        String previousTown = countriesList.getFirst();
        for(String s: countriesList){
            System.out.println("--->from "+ previousTown+ " to "+ s);
            previousTown = s;
        }
    }

    private static void printItinary3(LinkedList<String> countriesList){
        System.out.println("Trip starts at " + countriesList.getFirst());
        String previousTown = countriesList.getFirst();

        ListIterator<String> iterator = countriesList.listIterator();
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--->from "+ previousTown+ " to "+ town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + countriesList.getLast());
    }

    private static void usingIterator(LinkedList<String> countriesList){
        System.out.println("Trip starts at:"+ countriesList.getFirst());
        String previous = countriesList.getFirst();
        Iterator<String> iterator = countriesList.iterator();
        while(iterator.hasNext()){
            String town = iterator.next();
            System.out.println("--->from "+ previous+ " to "+ town);
            previous = town;
        }

        System.out.println("Trip ends at " + countriesList.getLast());
    }



    private static void addModeElements(LinkedList placesToVisitss){
        placesToVisitss.add(34);
    }

    private static void removeElements(LinkedList<String> list) {

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");
        // Queue/Deque poll methods
        String p1 = list.poll();  // removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst();  // removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast();  // removes last element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();  // removes first element
        System.out.println(p4 + " was removed");
    }

}
