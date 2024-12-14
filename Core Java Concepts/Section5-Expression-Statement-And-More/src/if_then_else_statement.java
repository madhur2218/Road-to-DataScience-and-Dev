public class if_then_else_statement {
    public static void main(String[] args) {

        boolean gameOver= true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score==5000){
            System.out.println("Score is 5000");
        }

        if(gameOver){
            System.out.println("GAME OVER");
        }
        else{
            System.out.println("GAME NOT OVER");
        }

        if(score>5000 && !gameOver){
            System.out.println("First block is executed");
        }
        else if (score==5000 && !gameOver){
            System.out.println("Second block is executed");
        }
        else{
            System.out.println("Nothing to be executed");
        }




    }
}
