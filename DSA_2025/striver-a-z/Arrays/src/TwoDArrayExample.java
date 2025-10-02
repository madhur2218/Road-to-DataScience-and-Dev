import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int column = sc.nextInt();

        int[][] matrix = new int[rows][column];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



    }
}
