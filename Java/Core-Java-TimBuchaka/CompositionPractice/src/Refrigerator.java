public class Refrigerator extends SmartKitchen{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(Boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderingFood(){
        if(hasWorkToDo){
            System.out.println("Ordering food from refrigerator!!");
            hasWorkToDo=false;
        }
    }
}
