interface DemoAnno{
    void meth1(int a);
//    void meth2();
}

//class HarryLambda implements DemoAnno{
//
//    @Override
//    public void meth1() {
//        System.out.println("this is a method 1");
//
//    }
//}


//class AnonyDemo implements DemoAnno{
//    public void display(){
//        System.out.println("hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("i am meth1");
//
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("i am meth2");
//
//    }
//}

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

//        AnonyDemo d1 = new AnonyDemo();
//        d1.meth1();

//        DemoAnno d2 = new DemoAnno() {
//            @Override
//            public void meth1() {
//                System.out.println("in new meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("in new meth2");
//
//            }
//        };

//        d2.meth2();
//        d2.meth1();

//        DemoAnno d1 = new HarryLambda();
//        d1.meth1();

        DemoAnno d2 = (a)-> System.out.println("in demoAnno d2 new from this lambda");

        d2.meth1(34);

    }
}