public class ternaryOperator {
    public static void main(String[] args) {
        int num =10;
        String result = (num%2==0) ? "Even" : "ODD";
        System.out.println(result);

        String makeOfCar= "BMW";
        boolean isDomestic = (makeOfCar=="BMW") ? true : false;
        System.out.println(isDomestic);

        if(isDomestic){
            System.out.println("this is a domestic car");
        }

        //if-then for above ternary opeerator
        if(makeOfCar == "BMW") {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        //Ternary operator example - elections
        int currentAge= 23;
        boolean canVote= (currentAge>=18)? true : false;
        if(canVote){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Cannot vote");
        }


    }
}
