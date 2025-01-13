//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account madhurAcount = new Account();
        madhurAcount.setBalance(100);
        madhurAcount.depositFunds(100);
        madhurAcount.withdrawlAmount(110);
        madhurAcount.withdrawlAmount(100);

        Account ashuAccount= new Account();
        ashuAccount.setNumber("7876566789");
        ashuAccount.setCustomerEmail("ashutosh2gmail.com");
        ashuAccount.setBalance(1000);
        ashuAccount.withdrawlAmount(9000);
        ashuAccount.depositFunds(9000);
        ashuAccount.withdrawlAmount(10000);
        System.out.println("............................");

        Person madhur = new Person();
        madhur.setAge(24);
        madhur.setFirstName("Madhur");
        madhur.setLastName("Nagrath");
        String result = madhur.getFullName();
        System.out.println(result);

        Person ashu=new Person();
        ashu.setLastName("sahu");
        ashu.setFirstName("");
        String result1 = ashu.getFullName();
        System.out.println(result1);

    }
}