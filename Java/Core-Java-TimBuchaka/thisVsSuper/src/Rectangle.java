public class Rectangle extends Shape{

    private int length;
    private int breadth;

    public Rectangle(int x, int y){
        this(x,y,0,0);
    }

    public Rectangle(int x, int y, int length, int breadth){
        super(x,y);
        this.length=length;
        this.breadth=breadth;
    }
}
