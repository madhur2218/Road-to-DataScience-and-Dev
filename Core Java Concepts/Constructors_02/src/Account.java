public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account(){
        System.out.println("Empty constructor");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public void depositFunds(double depositAmount){
        this.balance += depositAmount;
        System.out.println("New balance is "+this.balance);
    }

    public void withdrawlAmount(double withdrawAmount){
        if(this.balance - withdrawAmount <0){
            System.out.println("Insufficient funds");
        }
        else {
            this.balance -= withdrawAmount;
            System.out.println("New balance is "+ this.balance);
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }




}
