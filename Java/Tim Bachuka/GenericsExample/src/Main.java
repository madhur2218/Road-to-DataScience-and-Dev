import java.sql.Array;
import java.util.*;

record BaseballPlayer(String name, String position){}


class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();
        al.add(2);
        al.add(2);
        al.add(3);

        int a = al.get(2);
        System.out.println(a);

        MyGeneric<String, Integer> g1 = new MyGeneric(23, "MYSTRING", 43);
        String str = g1.getT1();
        Integer i = g1.getT2();
        System.out.println(str);
        System.out.println(i);

        Comparator<Integer> com = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10)
                    return 1;
                else {
                    return -1;
                }
            }
        };
            List<Integer> nums = new ArrayList();
        nums.add(23);
        nums.add(12);
        nums.add(34);
        nums.add(16);


        Collections.sort(nums,com);
        System.out.println(nums);


        }
    }
