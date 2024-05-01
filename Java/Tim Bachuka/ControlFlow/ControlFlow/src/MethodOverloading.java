public class MethodOverloading {

    public static void main(String[] args) {

        calculateScore("madhur", 23);
        calculateScore("malhar", 2133.0f);
        calculateScore(100.00f);
        calculateScore(100.00f, 12.00d, "Naman");
        calculateScore();

    }

    public static void calculateScore(String name, int score){
        System.out.println(name + " scored " + score);
    }

    public static void calculateScore(String name, float score){
        System.out.println(name + " scored " + score);
    }


    public static void calculateScore( float score){
        System.out.println("Unnamed player scored " + score);
    }

    public static void calculateScore(float score, double rollNo, String name){
        System.out.println(name + " player scored " + score+ " whose roll number is " + rollNo);
    }

    public static int calculateScore(){
        System.out.println("NO PLAYER NO SCORE");
        return 0;
    }

    //    Different Ways of Method Overloading in Java
//    Changing the Number of Parameters.
//    Changing Data Types of the Arguments.
//    Changing the Order of the Parameters of Methods

}
