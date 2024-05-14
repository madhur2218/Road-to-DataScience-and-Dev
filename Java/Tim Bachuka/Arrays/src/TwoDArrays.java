import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        int [][] arr2d = new int[4][4];
        System.out.println(Arrays.toString(arr2d));
        System.out.println(arr2d.length);

        for(int []outer :arr2d){
            System.out.println(Arrays.toString(outer));
        }
    }
}
