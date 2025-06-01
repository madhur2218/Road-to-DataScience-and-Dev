//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2208","DELL","250");
        Monitor monitor = new Monitor("27 inch beast", "ASUS",27,"2540x1440");
        MotherBoard motherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");
        PersonalComputer pc = new PersonalComputer("2208","DELL", computerCase,monitor,motherBoard);
        ///below calling is not a good way as we should not be accessing drawPixelAt,loadProgramme,pressPowerButton directly from main methods
        ///instead we should create methods which can directly be called from PersonalComputer
        pc.getMonitor().drawPixelAt(2,3,"red");
        pc.getMotherBoard().loadProgramme("Windows OS");
        pc.getComputerCase().pressPowerButton();
        System.out.println("-------------------------------");
        pc.powerUp();


        System.out.println("-------------Smart Kitchen ----------------------");
        SmartKitchen sk = new SmartKitchen();

        sk.getDishWasher().setHasWorkTodo(true);
        sk.getRefrigerator().setHasWorkTodo(true);
        sk.getCoffeeMaker().setHasWorkTodo(true);

        sk.getDishWasher().washDishes();
        sk.getRefrigerator().orderFood();
        sk.getCoffeeMaker().brewCoffee();

        sk.setKitchenState(true,false,true);
        sk.doKitchenWork();
    }
}