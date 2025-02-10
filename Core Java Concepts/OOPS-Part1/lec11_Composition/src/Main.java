//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Computercase theCase = new Computercase("2208", "Dell","240");

        Monitor monitor = new Monitor("27 inch beast","Asus",
                                27,"1080 x 1080");

        Motherboard motherboard = new Motherboard("BJ-220","Asus",6,4,"v2.44");

        PersonalComputer thePc = new PersonalComputer("Dell","1029",theCase,monitor,motherboard);

//        thePc.getMonitor().drawPixelAt(10,10,"red");
//        thePc.getMotherboard().loadProgram("Windoes OS");
//        thePc.getComputercase().printPowerButton();

        thePc.powerUp();

    }
}