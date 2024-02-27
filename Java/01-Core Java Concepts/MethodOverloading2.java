class Addition{
    public int sum(int a , int b){
        return a+b;
    }


    public int sum(int a , int b, int c){
        return a+b+c;
    }

    public double sum(int a ,  double b, double c){
        return a+b+c;
    }
}

public class MethodOverloading2 {
    public static void main(String a[]){

    Addition obj1 = new Addition();
    obj1.sum(2,3);

    Addition obj2 = new Addition();
    obj2.sum(2,3,4);

    Addition obj3 = new Addition();
    obj2.sum(2,3.1,4.2);

    }
}
