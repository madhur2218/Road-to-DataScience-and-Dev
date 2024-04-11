public class main {
    public static void main(String[] args) {
        
        ShapeFactory obj1 = new ShapeFactory();

        Shape shape1  = obj1.getShape("Circle");
        shape1.draw();

    }
}
