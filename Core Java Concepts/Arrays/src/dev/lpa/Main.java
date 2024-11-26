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


    }
}

//Size of array when created is fixed and cannot be modified