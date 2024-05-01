public class Method_Practice {
    public static void main(String[] args) {
        score();
        System.out.println(score1(20,20));
        System.out.println(score1(40,21));
        System.out.println(isAge(19));
//        System.out.println(doesSomething(12));
    }

    public static void score(){
        int a =10;
        int b= 20;
        int c = a+b;
        System.out.println(c);
    }

    public static int score1(int a , int b){
        return a+b;
    }

    //While declaring a void method which does not return anything, we can have a sout statement and all the arguments declared in that method
    //While declaring a int method which return a integer value can acn pass the parameters in our mthod and in main method we can pass arguments

    public static boolean isAge(int age){
        boolean result= false;
        if(age<21){
            System.out.println("can drink");
            result = true;
        }
        return result;
    }

    public static void doesSomething(int something){
        if(something>21)
            return;
    }

}
