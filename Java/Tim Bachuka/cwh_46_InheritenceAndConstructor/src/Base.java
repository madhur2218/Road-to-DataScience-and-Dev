public class Base {

    public Base(){
        System.out.println("I am a base constructor");
    }

    public Base(int a){
        System.out.println("I am a base constructor WITH PARAMETER with value as :" +a);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int x;
}
