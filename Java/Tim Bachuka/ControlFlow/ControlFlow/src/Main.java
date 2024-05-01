public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
         int a= 100;
         int b = 200;
         int c = 50;

         if(a%2==0){
             System.out.println("number is even");
         }
         else{
             System.out.println("number is odd");
         }


         boolean gameOver = true;
         int score = 4000;
         int levelComplete = 5;
         int bonus = 100;

         if(score < 5000 && score >1000){
             System.out.println("my score is less than 5000 and more than 1000");
         } else if (score >5000) {
             System.out.println("my score is greater than 5000");
         } else if (score >1000) {
             System.out.println("my score is greater than 1000");
         }else {
             System.out.println("i got here ");

         }
    }

}