public class Derived extends Base{

    public Derived(){
        //super(3);
        System.out.println("In derived constructor");
    }

    public Derived(int num1, int num2) {
        super(num1);
        System.out.println("In derived constructor with parameters and value of num2 as "+num2);
    }
}
