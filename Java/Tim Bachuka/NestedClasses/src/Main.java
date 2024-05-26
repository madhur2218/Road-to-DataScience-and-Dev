//Inner class Geek for Geeks
class Outer1{
    static void hello(){
        System.out.println("hello world");
    }
    static int a =1324;

     class Inner2{
        public void hi(){
            System.out.println("hi all");

        }
    }
}



class A{
    int age;
    public void show(){

        System.out.println("in show");


    }
    static class B{
        public void config(){
            System.out.println("in config");
        }

    }
}





class Outer{
    static int outer_x =12;
    private static int outer_private = 30;
    int outer_y = 20;

    static class Inner{

        void display(){
            System.out.println("outer_x = " + outer_x);
            System.out.println("outer_private = "
                    + outer_private);

            Outer out = new Outer();
            System.out.println("outer_y = " + out.outer_y);

        }

    }

}

public class Main {

    public static void main(String[] args)
        {
            // accessing a static nested class
            Outer.Inner nestedObject = new Outer.Inner();
            nestedObject.display();

            A a = new A();
            a.show();

            A.B b = new A.B();
            b.config();

            Outer1 o1 = new Outer1();
            Outer1.hello();
            int a1 = Outer1.a;
            System.out.println(a1);

            Outer1.Inner2 i2 = o1.new Inner2();

        }
}

