public class ChildDerived extends Derived {

    public ChildDerived(){
        System.out.println("i am overloaded child of derived");
    }
    public ChildDerived(int x, int y, int z){
        super(2,3);
        System.out.println("i am overloaded child of derived and value of z is "+ z);
    }
}
