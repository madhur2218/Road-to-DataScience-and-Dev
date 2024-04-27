public class Challenge1 {
    public static void main(String[] args) {
        double num1= 20.00d;
        double num2= 80.00d;
        double add = num1+num2;
        System.out.println("Addition is " +add);
        double mult = add * 100.00d;
        System.out.println("mult value is :" +mult);
        double div = mult %  40.0d;
        System.out.println("div value is :" + div);

        boolean isRemainder;
        if(div == 0.00){
            isRemainder=true;
        }

        else{
            isRemainder=false;

        }
//        boolean isRemainder = ((div == 0.00) ? true: false);
        System.out.println(isRemainder);

        if(isRemainder== true){
            System.out.println("got some remainder");
        }



    }
}
