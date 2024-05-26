class A1{
    public void show(){
        System.out.println("in A1 show");
    }

    class B1 extends A1{
        public void show(){
            System.out.println("in B show");
        }
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        A1 a1 = new A1()
        {
          public void show(){
            System.out.println("in new A1 show");
                    }
        };

        a1.show();

    }
}
