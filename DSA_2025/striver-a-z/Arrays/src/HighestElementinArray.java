public class HighestElementinArray {
    public static void main(String[] args) {

        //DSA-HIGHEST AND LOWEST ELEMENT IN ARRAY

        int [] arr = {5,34,55,65,34,98,76,23,45};
        System.out.println(arr.length);

        highestElement(arr);
        lowestElement(arr);

    }

    public static void highestElement(int[]arr){
        //brute force approach would be to sort array and then find largest value which would be in the end
        //better approach:
        int maxElement = arr[0];

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>maxElement){
                maxElement = arr[i];
            }
        }
        System.out.println("max element in array is: "+maxElement );
    }

    public static void lowestElement(int[]arr){
        int minElement = arr[0];

        for(int i=0;i<=arr.length-1;i++){
            if(minElement>arr[i]){
                minElement = arr[i];
            }
        }
        System.out.println("min element in array is: "+minElement);

    }
}
