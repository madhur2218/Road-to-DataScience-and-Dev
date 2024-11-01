public class Derived2 extends Derived {
    public Derived2() {
        //super(1,3);
        System.out.println("I am in derived2 constructor");
    }

    public Derived2(int a, int b, int c){
        super(a,b);
        System.out.println("I am in derived2 constructor with value of c "+c);

    }
}
