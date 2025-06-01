public class Rectange_goodConstructor {
    private int x;
    private int y;
    private int length;
    private int breadth;

    public Rectange_goodConstructor(){
        this(0,0);
    }

    public  Rectange_goodConstructor(int length, int breadth){
        this(0,0,length,breadth);
    }
    public Rectange_goodConstructor(int x , int y ,int length, int breadth) {
        this.x = x;
        this.y=y;
        this.length=length;
        this.breadth=breadth;
    }
}
