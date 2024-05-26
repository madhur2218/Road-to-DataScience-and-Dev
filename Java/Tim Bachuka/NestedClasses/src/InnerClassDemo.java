
class OuterClass {
    // static member
    static int outer_x = 10;

    // instance(non-static) member
    static int outer_y = 20;

    // private member
    private static int outer_private = 30;

    // inner class
     static class InnerClass {
        void display()
        {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);

            // can also access non-static member of outer
            // class
            System.out.println("outer_y = " + outer_y);

            // can also access a private member of the outer
            // class
            System.out.println("outer_private = "
                    + outer_private);
        }
    }
}

// Driver class
public class InnerClassDemo {
    public static void main(String[] args)
    {
        // accessing an inner class
        OuterClass outerObject = new OuterClass();

        OuterClass.InnerClass innerObject
                = new OuterClass.InnerClass();

        innerObject.display();
    }
}
