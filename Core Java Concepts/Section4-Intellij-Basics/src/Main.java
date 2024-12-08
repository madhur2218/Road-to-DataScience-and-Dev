//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        boolean isAlien = true;

        if(isAlien == false)
            System.out.println("NOT AN ALIEN");
            System.out.println("I am an alien");

            boolean isTrue = true;
            if(isTrue){
                System.out.println("it is true");
            }

            //Logical AND operator
            int topScore = 80;
            int secondTopScore= 91;
            if((topScore>secondTopScore) && (topScore<100)){
                System.out.println("Greater then top score and less than 100");
            }

            if((topScore>90) || (topScore>=80)){
                System.out.println("You got the highest score");
            }

            boolean isCar= false;
            if(isCar==true){   //HERE WE NEED TO PASS A BOOLEAN VALUE
                System.out.println("Printing car");
            }



    }
}