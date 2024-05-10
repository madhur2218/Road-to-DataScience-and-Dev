public class Method_oVERLOADING {
    public static void main(String[] args) {

        foo();
        foo(200);
        foo(200,300);

        double res = foo(200.2,300.2);
        System.out.println(res);

    }

    static void foo(){
        System.out.println("good morning");

    }
    static void foo(int a){
        System.out.println("good morning "+a);

    }

    static void foo(int a, int b){
        System.out.println("good morning "+a + "hello " + b);

    }

    static double foo(double a, double b){
        return 3.0d;
    }



}
