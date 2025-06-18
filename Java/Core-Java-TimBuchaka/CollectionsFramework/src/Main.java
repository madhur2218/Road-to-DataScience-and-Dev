import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String [] names = {"madhur","ashu","arshya"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        System.out.println(list.getClass().getName());

        list.add("fred");
        list.addAll(Arrays.asList("nagrath","malhar","naman"));
        System.out.println(list);

        System.out.println("Is Ishant in the list: "+ list.contains("Garry"));

        list.removeIf(s-> s.charAt(0) == 'n');
        System.out.println("Is Nagrath in the list: "+ list.contains("nagrath"));


    }
}