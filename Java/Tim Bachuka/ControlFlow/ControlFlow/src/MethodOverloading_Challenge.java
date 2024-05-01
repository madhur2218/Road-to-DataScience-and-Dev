public class MethodOverloading_Challenge {
    public static void main(String[] args) {

        System.out.println("5 foot 8 inch is "+ convertToCentimeters(5,8) + "cm");
        System.out.println("8 inch is "+ convertToCentimeters(8) + "cm");


    }

    public static double convertToCentimeters(int inches){
        return (inches * 2.45);
    }

//    public static double convertToCentimeters(int feet , int inches){
//        return (feet*12 + inches) * 2.45;
//
//    }

    public static double convertToCentimeters(int feet , int inches){
        return convertToCentimeters((feet*12) + inches);

    }
}
