import java.util.Scanner;

public class OneDArrayExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want in the array");
        int size = sc.nextInt();
        System.out.println("Size of array is:"+size);

        int[] arr = new int[size];

        System.out.println("Enter the elements in array");
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered array:");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }



    }
}
