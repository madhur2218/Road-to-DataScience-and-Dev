public class Example_1 {
    public static void main(String[] args) {

//        try{
//            int a = 10;
//            int b = 0;
//            int result = a/b;
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException();
//        }
//        finally{
//            System.out.println("Running finally block");
//        }


        try{
            doStuff(10,0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally{
            System.out.println("in finally block");

        }
    }
    public static int doStuff(int a, int b) throws Exception{
        return a/b;
    }
}
