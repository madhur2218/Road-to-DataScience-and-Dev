public class MyAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email ;
    private String phoneNumber;

    public void depositFund(double depositAmount){
        balance = balance+depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" +
                balance);
    }

    public void withdrawAmount(double withdrawFunds){

        if(balance-withdrawFunds<0){
            System.out.println("Insufficient Funds! You only have $" + balance +
                    " in your account.");
        }
        else{
            balance -= withdrawFunds;
            System.out.println("Withdrawal of $" + withdrawFunds +
                    " processed, Remaining balance = $" + balance);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "MyAccount{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
