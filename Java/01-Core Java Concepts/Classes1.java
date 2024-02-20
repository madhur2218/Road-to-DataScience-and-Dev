class Calculator{

    public void add(){
        System.out.println("adding");
    }

    public void sub(){
        System.out.println("subtracting");

}
}


class Calculator1{
    public int mult(int a , int b){
        int r = a*b;
        return r;
    }
}

public class Classes1{
    public static void main(String[] args) {
        
        Calculator obj1 = new Calculator();
        obj1.add();

        Calculator1 obj2 = new Calculator1();
        int result = obj2.mult(2,3);
        System.out.println(result);
    }
}


//Method can return void or something 