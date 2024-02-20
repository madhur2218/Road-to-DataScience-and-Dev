class Dog{
    public void bark(){
        System.out.println("dog barks");
    }

    public int count(int a , int b){
        int count = a+b;
        return count;
    }
}


public class Classes2 {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.bark();
        d.count(1,1);
        
    }   
}
