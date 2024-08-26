public class Challenge1 {
    public static void main(String[] args) {

        boolean game = true;
        int score = 10000;
        int levelCompleted= 8;
        int bonus = 200;
        int finalScore =score;

        calculateScore();

        game = true;
        score = 100;
        levelCompleted= 80;
        bonus = 208;

        if(game == true){
            //finalScore = finalScore+(levelCompleted*bonus);
            finalScore += (levelCompleted*bonus);
            System.out.println(finalScore);

        }


    }
    public static void calculateScore(){

        boolean game = true;
        int score = 10000;
        int levelCompleted= 8;
        int bonus = 200;

        int finalScore =score;

        if(game == true){
            //finalScore = finalScore+(levelCompleted*bonus);
            finalScore += (levelCompleted*bonus);
            System.out.println(finalScore);

        }

    }
}
