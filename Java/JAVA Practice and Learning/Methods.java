public class Methods {
    public static void main(String[] args) {

        loop1();
        System.out.println("-------------------");
        loop2();
        System.out.println("-------------------");
        loop(3,4);
        int area = areaRectangle(2,2);
        System.out.println("Area is :" + area);



    }

    public static int areaRectangle(int height, int breadth){
        return height*breadth;
    }

    public static void loop1(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    public static void loop2(){
        for(int i=11;i<20;i++){
            System.out.println(i);
        }
    }


    public static void loop(int start, int stop) {
        for(; start < stop; start++) {
            System.out.println(start);
        }
    }
}

