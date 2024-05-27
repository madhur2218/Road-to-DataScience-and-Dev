class LocalInnetClaSS{
    void printData(){
        class Local{
            private int x = 10;
             void printHello(){
                System.out.println("printing hello" + x);

            }

        }
        Local l1= new Local();
        l1.printHello();

    }
}


public class LocalInnerClass {
    public static void main(String[] args) {
        LocalInnetClaSS s1 = new LocalInnetClaSS();
        s1.printData();
    }
}
