import java.util.Arrays;
import java.util.Random;

public class JavaUtilsArraysClass {
    public static void main(String[] args) {

        int [] randomArray = getRandomArray(10);
        System.out.println(Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray)); // array with values 0


        int [] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int [] thirdArray = getRandomArray(5);
        System.out.println(Arrays.toString(thirdArray));

        int [] fourthArray = Arrays.copyOf(thirdArray, 40);
        System.out.println(Arrays.toString(fourthArray));

        int [] smallerArray = Arrays.copyOf(thirdArray, 4);
        System.out.println(Arrays.toString(smallerArray));

        int [] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));


        int arr8 [] = new int[10];
        int [] arr9 = arr8;
        System.out.println(Arrays.toString(arr8));
        System.out.println(Arrays.toString(arr9));
        arr8[0]= 100;
        System.out.println(Arrays.toString(arr8));
        System.out.println(Arrays.toString(arr9));


    }

    private static int [] getRandomArray(int len){
        Random random = new Random();
        int a[] = new int[len];
        for(int i=0; i<len; i++){
            a[i] = random.nextInt(100);
        }
        return a;




    }
}
