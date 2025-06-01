public class CoffeeMaker extends  SmartKitchen{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(Boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("brewing coffee!!");
            hasWorkToDo=false;
        }
    }
}
