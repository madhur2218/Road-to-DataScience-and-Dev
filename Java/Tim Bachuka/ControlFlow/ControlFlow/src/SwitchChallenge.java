public class SwitchChallenge {
    public static void main(String[] args) {

        System.out.println(nato('C'));
        System.out.println(add(1,2,3));
        add(1.1,1.1,1.1);

    }

    public static String nato(char ch) {
        String result;
        switch(ch) {
            case 'A':
                result = "Able";
                break;
            case 'B':
                result = "Baker";
                break;
            case 'C':
                result = "Charlie";
                break;
            case 'D':
                result = "Dog";
                break;
            default:
                result = "Unknown value";
        }
        return result;
    }

    public static int add(int a , int b, int c){
        int sum = a+b+c;
        return sum;
    }

    public static void add(double a , double b, double c){
        double sum = a+b+c;
        System.out.println(sum);
    }


}
