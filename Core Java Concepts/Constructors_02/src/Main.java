//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

}
    }