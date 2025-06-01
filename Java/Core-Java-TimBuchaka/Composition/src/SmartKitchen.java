public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private Refrigerator refrigerator;
    private DishWasher dishWasher;

    public SmartKitchen (){
    }
    public SmartKitchen(CoffeeMaker coffeeMaker, DishWasher dishWasher, Refrigerator refrigerator) {
        this.coffeeMaker = coffeeMaker;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }


    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public void setCoffeeMaker(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public void setKitchenState(boolean coffeelag, boolean fridgeflag, boolean dishWasherFlag){
        coffeeMaker.setHasWorkTodo(coffeelag);
        refrigerator.setHasWorkTodo(fridgeflag);
        dishWasher.setHasWorkTodo(dishWasherFlag);

    }

    public void doKitchenWork(){
        coffeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishWasher.washDishes();
    }
}
