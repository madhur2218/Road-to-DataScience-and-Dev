public class Methods {
    public static void main(String[] args) {
        calculateScore_withoutParameters();//this is a calling method, takes nothing and returns nothing
        calculateScore_withParameters(12,23,45,true);
    }

    private static void calculateScore_withoutParameters() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver = true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Final score is " + finalScore);
        }
    }

    private static void calculateScore_withParameters(int score,int levelCompleted, int bonus ,boolean gameOver) {
         gameOver = true;
         score = 800;
         levelCompleted = 5;
         bonus = 100;

        int finalScore = score;

        if (gameOver = true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Final score is " + finalScore);
        }
    }
}
