//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //CODE WITHOUT ENCAPSULATION

//        Player p1 = new Player();
//        p1.name= "Madhur";
//        p1.health = 100;
//        p1.weapon="sword";
//
//        int damage = 10;
//        p1.looseHealth(damage);
//        System.out.println("Remaining health = "+ p1.healthRemaining());
//
//        p1.looseHealth(100);
//        p1.health= 100;
//        System.out.println("Remaining health = "+ p1.healthRemaining());

        //using encapsulation

        EnhancedPlayer e1 = new EnhancedPlayer(200,"tim","knife");

        //Encapsulation princles :-
        //Need constructors for creating objects which enforces objects with valid data will only be created
        //use private access modifiers to access fields
        //use setter methods separately and use only when needed

        //Encapsulation Challenge

        ChallengePrinter duplexPrinter = new ChallengePrinter(50, true);
        System.out.println("Printer pages : "+ duplexPrinter.getPagesPrinted());

        int pagesPrint = duplexPrinter.printPages(3);
        System.out.printf("Current job pages is: %d and Printer total : %d\n",pagesPrint,duplexPrinter.getPagesPrinted());

         pagesPrint = duplexPrinter.printPages(3);
        System.out.printf("Current job pages is: %d and Printer total : %d\n",pagesPrint,duplexPrinter.getPagesPrinted());

        pagesPrint = duplexPrinter.printPages(5);
        System.out.printf("Current job pages is: %d and Printer total : %d\n",pagesPrint,duplexPrinter.getPagesPrinted());

    }
}