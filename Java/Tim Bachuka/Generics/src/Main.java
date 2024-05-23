import java.util.ArrayList;

class MyGeneric<T1, T2>{
    int val = 344;
    private T1 t1;
    private T2 t2;
    MyGeneric(int val , T1 t1, T2 t2){
        this.val = val;
        this.t1 =t1;
        this.t2 =t2;
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
        //System.out.println("Hello world!");

        ArrayList<Integer> a1 = new ArrayList();
        //a1.add("hello");
        a1.add(34);
        a1.add(432);

//        int i1 = (int) a1.get(1);
//        System.out.println( i1 );

        MyGeneric <String, Integer> g1 = new MyGeneric(13, "hello world",32);
        System.out.println(g1.getT1());
        System.out.println(g1.getT2());

    }



}