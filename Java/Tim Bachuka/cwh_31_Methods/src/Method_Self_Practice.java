public class Method_Self_Practice {

    public static void main(String[] args) {
        int res= addition(2,3);
        System.out.println(res);

        System.out.println(addition(1,3));

        addition1(1,2);

        addition2();
    }
    static int addition(int a, int b){
        int c= a+b;
        return c;
    }

    static void addition1(int a, int b){
        int c = a+b;
        System.out.println(c);
    }

    static void addition2(){
        int a=10;
        int b= 20;
        int c=a+b;
        System.out.println(c);
    }

}
