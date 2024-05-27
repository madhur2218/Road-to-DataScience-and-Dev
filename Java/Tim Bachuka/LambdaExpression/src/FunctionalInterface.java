@java.lang.FunctionalInterface
interface A {
    void show();
}

public class FunctionalInterface {

    public static void main(String[] args) {
        // Creating an instance of A by implementing its abstract method
        A obj = new A() {
            public void show() {
                System.out.println("showing");
            }
        };

        // Calling the show method
        obj.show();
    }
}
