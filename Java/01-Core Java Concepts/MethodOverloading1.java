class Addition1{
    public int sum(int a , int b){
        return a+b;
    }


    public int sum(int a , int b, int c){
        return a+b+c;
    }
}

public class MethodOverloading1 {
    public static void mian(){

        Addition1 obj1 = new Addition1();
        int result = obj1.sum(2,3);
        System.out.println(result);

    }
}
