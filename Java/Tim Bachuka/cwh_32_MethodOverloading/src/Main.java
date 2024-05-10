public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        tellJoke();

        //Case1: Change in integer : value of integer does not get changed
        int x=43;
        change(x);
        System.out.println(x);


        //Case2: Change in array : value of array do gets changed
        int arr[] = {1,2,3,4};
        change2(arr);
        System.out.println(arr[0]);

    }
    static void tellJoke(){
        System.out.println("i am a joker");
    }

    static void change(int a){
         a =23;
    }

    static void change2(int a[]){
        a[0]= 23;
    }
}