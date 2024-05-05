public class TheForLoop {
    public static void main(String[] args) {

        for(int i =0; i<=10; i++){
            System.out.println(i);
        }

        for(double rate = 1; rate<=5.00 ; rate ++){
            double interestAmount = calculateInterest(1000, rate);
            System.out.println("10,000 at " + rate + " is " + interestAmount);

        }

        for (double i = 7.5 ; i<10; i+=0.25){
            double interestAmount = calculateInterest(1000, i);
            if(interestAmount >= 80){
                break;
            }
            System.out.println("New 10,000 at " + i + " is " + interestAmount);

        }
    }


    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
