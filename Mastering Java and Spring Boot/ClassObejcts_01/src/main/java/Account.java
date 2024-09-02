public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerNumber;

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

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }


    public void depositAccount(double depositAmount){
        this.balance = balance + depositAmount;
        System.out.println("New balance is: " + balance);
    }

    public void withDrawAmount(double withDrawAmount){
        if(balance - withDrawAmount <0){
            System.out.println("Insufficient funds");
        }
        else{
            balance = balance-withDrawAmount;
            System.out.println("Remaining balance is: "+balance);
        }
    }
}
