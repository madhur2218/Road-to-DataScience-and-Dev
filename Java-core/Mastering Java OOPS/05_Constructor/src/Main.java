public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345", 500,
                "Bob Brown", "myemail@bob.com",
                "(087) 123-4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");
        
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);


        Car audi = new Car("Audi","A3","Red",4);
        System.out.println(audi);

        Car bmw = new Car("BMW","Q4");
        System.out.println(bmw);

        Car tesla = new Car();
        System.out.println(tesla);

        PizzaOrder farmHouse = new PizzaOrder();
        System.out.println(farmHouse);





    }
}
