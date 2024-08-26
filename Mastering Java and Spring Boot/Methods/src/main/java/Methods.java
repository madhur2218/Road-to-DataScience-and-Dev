public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score =10;
        int levelCompleted = 100;
        int bonus = 30;

        int finalScore = score;

    }

    public static void calculateScore(){

        boolean gameOver = true;
        int score =10;
        int levelCompleted = 100;
        int bonus = 30;

        int finalScore = score;

        if(gameOver){
            finalScore+=(levelCompleted*score);
            System.out.println(finalScore);

        }
    }
}
