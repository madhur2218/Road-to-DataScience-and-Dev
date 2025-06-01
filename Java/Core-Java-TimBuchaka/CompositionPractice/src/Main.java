public class Main {
    public static void main(String[] args) {

        ComputerCase computerCase = new ComputerCase("2208","DELL","250");
        Monitor monitor = new Monitor("27 inch beast", "ASUS",27,"2540x1440");
        MotherBoard motherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");

        PersonalComputer myPc = new PersonalComputer("2208","DELL",computerCase,monitor,motherBoard);
        System.out.println(myPc);

        myPc.getComputerCase().pressPowerButton();
        myPc.getMotherBoard().loadProgramme("Windows OS");
        myPc.getMonitor().drawPixelAt(2,2,"black");

        System.out.println("-------------------------------------------");
        myPc.powerUp();
        myPc.drawLogo();
        myPc.loadProgramme("MAC OS");

        System.out.println("-------------------SMART KITCHEN------------------------");

        SmartKitchen sk = new SmartKitchen();
        sk.getBrewMaster().setHasWorkToDo(true);
        sk.getIceBox().setHasWorkToDo(true);
        sk.getDishWasher().setHasWorkToDo(true);
        sk.getBrewMaster().brewCoffee();


        sk.setKitchenState(true,false,true);
        sk.doKitchenStuff();




    }
}