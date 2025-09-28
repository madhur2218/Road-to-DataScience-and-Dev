public class Pattern1 {
    static void main() {
        //Pattern1();
        //Pattern2();
        //Pattern3();
        Pattern4();
    }

    public static void Pattern1(){
        for(int i =0; i<4; i++){
            for(int j =0; j<4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern2(){
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern3(){
        for(int i=1;i<5;i++){
            for(int j=1; j<=i; j ++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void Pattern4(){
        for(int i=1;i<5;i++){
            for(int j=1; j<=i; j ++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }


}
