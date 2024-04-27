import java.sql.SQLOutput;

public class AndOroperators {
    public static void main(String[] args) {
        int topScore = 80;
        if(topScore <= 100){
            System.out.println("you scored top score");
        }

        int secondTopscore = 82;
        if(topScore>secondTopscore && topScore<100){
            System.out.println("Greater than second top score and less than top 100");

        }

        if(topScore>90 || secondTopscore<90){
            System.out.println("either of the condition is true");
        }


        int num1= 10;
        int num2= 20;

        if(num1>num2 && num1==10){
            System.out.println("num1 is greater than num2");
        }
        else {
            System.out.println("num1 is less than num2");
        }

        boolean isCar= false;
        if(!isCar){
            System.out.println("is the car ");
        }

        int newVal =50;
        if(newVal == 50){
            System.out.println("this is true");
        }

        //Terinary Operator

        String carName= "BMW";
        boolean isDeomestic = (carName=="BMW"? true :false);
        if(isDeomestic){
            System.out.println("this car runs and is true");
        }

        int age =23;
        boolean canVote = (age >=18 ? true : false);
        if(canVote){
            System.out.println("i can vote");
        }

        int ageOfClient = 10;
        String canDrink= ((ageOfClient>20) ? "can drink" : "cannot drink");
        System.out.println(canDrink);


        int s1= 45;
        String vote1 =((s1>=18) ? "S1 CAN VOTE" : "S1 CANNOT VOTE");
        System.out.println(vote1);
        //Terinary operator is short form of if-else statement
        if(s1>18){
            System.out.println("s1 can vote");
        }
        else{
            System.out.println("s1 cannot vote");
        }


    }

}

