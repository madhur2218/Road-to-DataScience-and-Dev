public class MethodChallenge {

    public static void main(String[] args) {

        int highscorePosition= calculateHighScorePosition(60);
        displayHighScorePosition("Madhur", highscorePosition);


    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on high score list");
    }

    public static int calculateHighScorePosition(int score){
        int position=4;

        if(score>=1000){
            position = 1;
//            return 1; //Instead od writing multiple return statements, we can define a variable
        } else if (score>=500) {
//            return 2;
            position = 2;
        } else if (score>=100) {
//            return 3;
            position = 3;
        }
        return position ;

    }
}
