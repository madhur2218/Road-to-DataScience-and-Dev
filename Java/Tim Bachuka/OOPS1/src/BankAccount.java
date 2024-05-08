public class BankAccount {
    private String accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
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


    public void depositeFunds(int depositAmount){
        accountBalance += depositAmount;
        System.out.println("deposite of "+ depositAmount + "New balance is "+ accountBalance);
    }
    public void withdrawFunds(int depositeAmount){
        if(accountBalance-depositeAmount<0){
            System.out.println("Insufficient funds");
        }

    }
}
