public class operatorPrecedence {
    public static void main(String[] args) {
        double num1 = 20.00d;
        double num2 = 80.00d;
        double result = (num1+num2)*100.00d;
        System.out.println(result);

        double remainder = result % 40.00d;
        System.out.println(remainder);
        boolean isNoremainder=  (remainder == 0)? true: false;
        System.out.println(isNoremainder);

        if(isNoremainder){
            System.out.println("got remainer 0 ");
        }




    }
}
