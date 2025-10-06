//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Declaring array and inserting values
        int [] arrayInt= new int[5];
        arrayInt[0]=1;
        arrayInt[1]=2;
        arrayInt[2]=3;
        arrayInt[3]=4;
        arrayInt[4]=5;

        for(int i=0; i<arrayInt.length; i++){
            if(i == arrayInt.length-1){
                System.out.println(arrayInt[i]);
            }
            else{
                System.out.print(arrayInt[i] + ", ");
            }
        }

        int[] arr2 = {3,45,6,2,3,635,345,23};
        for(int i=0;i<arr2.length-1;i++){
            if(i == arrayInt.length-1){
                System.out.print(arr2[i]);
            }
            else{
                System.out.print(arr2[i] + ", ");
            }
        }

    }
}