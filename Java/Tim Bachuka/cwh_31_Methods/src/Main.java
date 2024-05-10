public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a= 10;
        int b = 20;
        int c;
        c = logic(10,20);

        System.out.println(c);
        int a1= 40;
        int b1 = 20;
        int c1 = logic(a1,b1);
        System.out.println(c1);

    }


    public static int logic(int x, int y){
        int z;
        if(x>y){

            z=x+y;
        }else{
            z= (x+y)*20;
        }
        return z;

    }

    public static void logic1(int x, int y){
        int z = x+y;
        System.out.println(z);
    }

    public static void logic2(){
        int z;
        int x=20;
        int y= 1;
        System.out.println(x+y);
    }
}