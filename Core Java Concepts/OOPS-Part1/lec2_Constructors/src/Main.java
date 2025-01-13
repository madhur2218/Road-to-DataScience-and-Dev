import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println(a1.getBalance());
        Account a2 = new Account("23423",234.243d,"ashu","ashu2gmail.com","54575687");
        System.out.println(a2.getBalance());
        System.out.println("-----------------------");

        Account bobAccount = new Account();
        Account timAccount = new Account("TIM","tim@gmail.com","235234");
        System.out.println(timAccount.getNumber());
        System.out.println(timAccount.getCustomerName());
        System.out.println("------------------------------");

        //Customer tim = new Customer("TIM",3000,"tim@gmail.com");
        Customer nobody = new Customer();
        System.out.println("--------------------------");

        Person madhur = new Person();

    }
}