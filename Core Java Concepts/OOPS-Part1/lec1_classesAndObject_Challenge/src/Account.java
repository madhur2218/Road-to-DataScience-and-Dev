public class Account {
    private String number;
    private double balance;
    private String customerEmail;
    private String customerPhone;

    public void depositFunds(double depositAmount){
        this.balance= balance + depositAmount;
        System.out.println("Amount of "+ depositAmount+ " made. New balnce is "+ this.balance);
    }

    public void withdrawlAmount(double withdrawlAmount){
        if(balance<withdrawlAmount){
            System.out.println("Insufficient amount, you only have " + balance+ " in your account");
        }
        else{
            //balance = balance - withdrawlAmount;
            balance-=withdrawlAmount;
            System.out.println("Withdrawl of " + withdrawlAmount+ ". Remaining balance is "+ balance);

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
