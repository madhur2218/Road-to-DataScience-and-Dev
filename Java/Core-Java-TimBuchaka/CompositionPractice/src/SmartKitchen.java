public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen(){
        this.brewMaster = new CoffeeMaker();
        this.iceBox = new Refrigerator();
        this.dishWasher = new DishWasher();
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWashFlasg){
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWashFlasg);
    }

    public void doKitchenStuff(){
        brewMaster.brewCoffee();
        iceBox.orderingFood();
        dishWasher.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}
