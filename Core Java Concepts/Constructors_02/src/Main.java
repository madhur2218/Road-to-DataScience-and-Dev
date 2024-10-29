
public class Main {


    public static void main(String[] args) {
        Account ram = new Account();
        ram.setCustomerName("ram");
        ram.setNumber("345654798900");
        ram.setCustomerEmail("ram@gmail.com");
        ram.withdrawlAmount(20);
        ram.depositFunds(100);
        ram.withdrawlAmount(80);

        Account a1 = new Account(); //this is an default constructor

        Account madhur = new Account("123124",1000,"madhur","madhurnagrath@gmail.com","7656788908");
        madhur.withdrawlAmount(200);

        Account tim = new Account("tim","tim@gmail.com","5675346457");
        System.out.println(tim.getNumber());
        System.out.println(tim.getBalance());
        System.out.println(tim.getCustomerName());



        Customer raj = new Customer("raj", 10.01, "raj@gmail.com");
        System.out.println(raj.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());

        Customer malhar= new Customer("malhar",20.134,"malhar@gmail.com");
        System.out.println(malhar.getName());
        System.out.println(malhar.getCreditLimit());
        System.out.println(malhar.getEmail());

        Car c1 = new Car("Tesla","blue", 4,true);
        System.out.println(c1.toString());
        c1.setDoors(2);
        System.out.println(c1.toString());

        Car c2 = new Car();
        System.out.println(c2.toString());

        Car c3 = new Car(false);
        System.out.println(c3.toString());



    }

}