public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Car car;          //uninitialized variable - causes compile time error
        //Car car1 = null;  // variable with null reference - throws exception at runtime
        Car car = new Car();

//        car.brand ="audi";   //We cannot access them directly as they are privately declated in Car class and has no scope
//        car.color= "blue";
//        car.doors = 2;
        car.setBrand(null);
        car.setDoors(4);

        car.describe();
        System.out.println(car.getBrand());
        System.out.println(car.getColor());
        System.out.println(car.getDoors());


        Car targa = new Car();


        BankAccount b1 = new BankAccount();
        b1.setAccountNumber("123");
        System.out.println(b1.getAccountNumber());

    }
}