public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    Customer(){
        this("nobody", "nobody@gmail.com");
    }
     Customer(String name, String email) {
        this(name, 10.00,email);
    }

    Customer(String name, Double creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
