import java.sql.SQLOutput;

public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int bonus = 200;
        int levelComplete = 8;
        int finalScore = score;

        int highScore = calculateScore(true, 5000,100, 5); //Passing the arguments from below method
        System.out.println("Highscore is " + highScore);


        score = 10000;
        bonus = 200;
        levelComplete = 8;
        finalScore = score;


        if (gameOver==true) {
            finalScore = finalScore + ( levelComplete * bonus);

            System.out.println("Final Score: " + finalScore);
        }

        //Above, code duplication is happening

        //Remember: if i had created new variables for this challenge, then new variables would have been created in my memory
        //Never duplicate code as it could lead to errors, hence use Methods. ie. methods declared executable code that can be invoke, passing fixed number of arguments

    }

    public static int calculateScore( boolean gameOver ,int score,int bonus,int levelComplete ) //These are my parameters for methods
        {

        int finalScore = score;

        if (gameOver==true) {
            finalScore = finalScore + ( levelComplete * bonus);
            finalScore= finalScore+1000;
        }
        return finalScore;

    }}
