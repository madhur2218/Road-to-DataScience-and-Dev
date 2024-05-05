public class WhileLoop {
    public static void main(String[] args) {

//        int j=0;
//        while(j<=10){
//            System.out.println(j);
//            j++;
//        }
//
//
//        int a=0;
//        while(true){
//            if(a>10){
//                break;
//            }
//            System.out.println(a);
//            a++;
//
//        }

        int b=1;
        boolean isReady = false;
        do{
            if(b>5){
                break;
            }
            System.out.println(b);
            b++;
        }while(isReady);
    }
}
