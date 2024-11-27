package dev.lpa;

public class Main {
    public static void main(String[] args) {
         int [] intArray = new int[10];
         intArray[2]= 40;

         double doubleArray[] = new double[10];
         doubleArray[5] = 23.43d;
        System.out.println(doubleArray[5]);

        System.out.println(doubleArray[2]);

        for(int i=0; i<=doubleArray.length-1; i++){
            System.out.println(doubleArray[i]);
        }

        //Array of int
        int[] arr1  = new int[3];
        arr1[0] = 12;
        arr1[1]= 413;
        arr1[2]= 365;
        System.out.println("VALUE OF ARR1 IS:");
        for(int i=0;i<=arr1.length-1;i++){
            System.out.println("value at index "+i+" is" +arr1[i]);
        }

        //Array of double
        double[] arr2 = new double[3];
        arr2[0] = 123.324d;
        arr2[1]= 423.123d;
        arr2[2]= 34d;
        for(int i=0;i<=arr2.length-1;i++){
            System.out.println("value at index "+i+" is " +arr2[i]);
        }

        //Anoynomous array
        int [] arr3 = {1,2,3,4,5,6};
        for(int i=0;i<=arr3.length-1;i++){
            System.out.println("value at index "+i+" is " +arr3[i]);
        }

        String [] names = new String[3];
        names[0]= "madhur";
        names[1]="malhar";
        names[2]="ishant";

        for(int i=0;i<=names.length-1;i++){
            System.out.println("value at index "+i+" is " +names[i]);
        }

        int arrayLength = names.length;
        System.out.println(arrayLength);
        System.out.println(names[arrayLength-1]);

        float arr4[] = new float[]{1,2,3,4,4};
        int length_arr4= arr4.length;
        System.out.println(arr4[length_arr4-1]);

        int arr5[];
        arr5 = new int[]{1,2,3,4};

        for(int i : arr5){
            System.out.println(i);
        }





    }
}

//Size of array when created is fixed and cannot be modified