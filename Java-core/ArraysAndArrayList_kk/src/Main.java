
public class Main {
    public static void main(String[] args) {

        int rno1 = 12;
        int rno2= 21;
        int rno3= 211;
        int rno4= 2451;
        //not possible to store 500 roll numbers like this

        //need of array datastructure
        //datatype[] variableName = new dataType[size];

        int[] rollNums = new int[10];
        int[] rollNums2 = {2,3,4,5,6,2,1};  //this will contain only integer values

        int[] ros;// initial declaration of array, ros is getting defined in stack, ros is refernce variable
        ros = new int[10]; //initialization; here the object is being created in the heap memory
        System.out.println(ros[8]);

        String [] names = new String[10];
        System.out.println(names[5]);

        //2d array

        int [][] arr_2d = new int[3][5];
        int [][] arr_2 = {
                {1,2,3},
                {5,3,2},
                {44,33,346534,1231,24,5657}
        };


     }
}


//array objects are not continuous, why?
//memory management in array
//jvm stuff about array
//compile time and run time in array, what happens
//empty array will always contain 0 if int
//empty array will always contain null if string
//refernce variable, by default will always have null

