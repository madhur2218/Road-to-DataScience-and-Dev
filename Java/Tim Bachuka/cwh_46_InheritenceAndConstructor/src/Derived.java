public class Derived extends Base{

    public Derived(){
        super(2);
        System.out.println("I am a derived constructor");
    }

    public Derived(int x, int y){
        super(x);
        System.out.println("i am an overloaded constructor with value of y as :" +y);

    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int y;
}
