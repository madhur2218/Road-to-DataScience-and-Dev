import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] arr = new int [10];

        arr[4]= 20;
        arr[1]= 40;
        //arr[40]= 40;  Array out of bound exception
        //arr[2]= "hello";  will get error over here
        System.out.println(arr[1]);

        double [] arr1 = new double[4];
        arr1[0]= 23.42d;
        System.out.println(arr[0]);

        //Initializing an array at runtime - Array Initializer
        int [] arr2 = new int[] {1,2,3,2,5,4,7,8,67,3};

        int [] arr3 = {5,4,3,2,4,5,6,4,4,3};
        int arrlength = arr3.length;
        System.out.println("length of array is :" +arrlength);
        System.out.println("last value is "+ arr3[arr.length-1]);

       // int arr4 [];
        //arr4 ={23,4,5,2}  // we cannot declare a array initializer outside a declaration statement

        int [] arr4 = {3,4,5,6,7,5};
        for(int i=0; i<=arr4.length-1;i++){
            System.out.println("value at index "+ i+ " is " +arr4[i]);
        }
//
//        int [] arr5 = new int[5];
//        for(int i = 0 ; i<=arr.length-1;i++){
//            System.out.print(arr5[i]+ " ");  //declares an array with value 0
//        }

        // if we declare an empty array of type Booolean, then it would contain FALSE values
        //if we declate an empty array of type Class, then it would contain NULL values

        int []arr6 = {1,2,3,4,5};
        for(int i =0; i<=arr6.length-1; i++){
            arr6 [i] = arr6.length - i ;
        }
        for(int i=0;i<=arr6.length-1;i++){
            System.out.println(arr6[i]);
        }

        int [] arr7 = {1,2,3,4,5};
        for(int element : arr7){
            System.out.println(element);
        }

        System.out.println(Arrays.toString(arr7)); // no use of for loop for printing elements in array

        Object objectVariable = arr7;
        if(objectVariable instanceof double[]){
            System.out.println("object variable is an integer array");
        }else System.out.println("no integer array");

        Object [] objArr = new Object[3];
        objArr[0] = "Hello";
        objArr [1] = new StringBuilder("BUILDER");

        for(Object element : objArr){
            System.out.println(element);
        }
    }
}