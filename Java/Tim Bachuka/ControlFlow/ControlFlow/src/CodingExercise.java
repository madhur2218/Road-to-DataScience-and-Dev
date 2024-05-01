public class CodingExercise {
    public static void main(String[] args) {
        checkNumber(12);
        checkNumber(0);
        checkNumber(-10);

    }

    public static void checkNumber(int num){   //Solved with and without return statement
//        int number= num;
        if(num>0){
            System.out.println("positive");
        } else if (num<0) {
            System.out.println("negative");
        }
        else
            System.out.println("zero");
//        return number;
    }
}
