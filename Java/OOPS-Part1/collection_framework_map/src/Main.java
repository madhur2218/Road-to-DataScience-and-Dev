import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> students  = new HashMap<>();

        //adding values in a map
        students.put(166,"lakshita");
        students.put(167,"lakshay");
        students.put(168,"lovejit");
        students.put(169,"madhur");
        students.put(null,"malhar");
        //students.put(null,"ishant"); map cannot contain multiple null in keys but can have in values


        System.out.println(students);

        String s = students.get(169); //prints out the value at a key
        System.out.println(s);

        String s1 = students.get(44);  //prints null as there is no key with this value
        System.out.println(s1);

        System.out.println(students.containsKey(77)); //check if key is present

        System.out.println(students.containsKey(169)); //check if key is present

        //looping on a map
        Set<Integer> keys =  students.keySet();
        for(int i : keys){
            System.out.println(students.get(i));
        }

        System.out.println(students.keySet()); //prints out all keys

        Set<Map.Entry<Integer,String>> mapEntry = students.entrySet();
        for(Map.Entry<Integer, String> i : students.entrySet()){
            System.out.println( i.getKey() + " : "+  i.getValue());
        }

        for(Map.Entry<Integer, String> entry : mapEntry){
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry);
        }


    }
}

//map do not extend collection interface, it is a seprate interface
