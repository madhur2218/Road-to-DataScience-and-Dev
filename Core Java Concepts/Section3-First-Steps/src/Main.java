import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        int helloWorld = 12;
        System.out.println(helloWorld);
        helloWorld = 10020;
        System.out.println(helloWorld);
        System.out.println("hello world");

        int myFirstNumber = (10+5) + (12+23);
        System.out.println(myFirstNumber);

        int num1 = 1000;
        int a = Integer.MIN_VALUE;
        System.out.println("MY MINIMUM VALUE IS " +a);

        a =  Integer.MAX_VALUE;
        System.out.println("MY MAXIMUM VALUE IS " + a);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE+1);

        //int willTisCompile= 2147483648;  NOT COMPILE
        int willTisCompile1 = Integer.MAX_VALUE+1;  //will compile
        int willTisCompile2 = 2147483647+1;  //will not compile

        System.out.println("byte datatype : " + Byte.MIN_VALUE);
        System.out.println("byte datatype : " + Byte.MAX_VALUE);

        System.out.println("short datatype : " + Short.MIN_VALUE);
        System.out.println("short datatype : " + Short.MAX_VALUE);

        long nun_long = 12L;
        System.out.println("Width of long is " + Long.SIZE);
        System.out.println("Max VALUE OF LONG IS " + Long.MAX_VALUE);
        System.out.println("MIN VALUE OF LONG IS " + Long.MIN_VALUE);

        int num = 12, num2 = 12;

        //This is example of casting
        byte minValue = 124;
        minValue = (byte )(minValue/2);
        System.out.println(minValue);

        //floats and doubles
        float num_float = 12.3F;
        double num_double = 12.34D;
        System.out.println("Value range of float is : "+ Float.MIN_VALUE +" and "+ Float.MAX_VALUE );

        //Casting using double and float
        float float_num = 12.12f;
        double d = (double) (float_num);

        //Character and Boolean type
        










    }
}