//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog fluffy = new Dog();
        fluffy.setName("fluffy");
        Dog tim = new Dog();
        tim.setName("tim");

        System.out.println(fluffy.getName());
        System.out.println(tim.getName());

        Dog d1 = new Dog();
        d1.setsurName("ashu");
        Dog d2 = new Dog();
        d2.setsurName("madhur");

        System.out.println(d1.getsurName());
        System.out.println(d2.getsurName());



        //Static method implementation
        System.out.println(sum(2,3));
    }
    private static int sum(int a, int b){
        return a+b;
    }
}