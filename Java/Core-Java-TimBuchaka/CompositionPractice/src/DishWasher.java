public class DishWasher extends SmartKitchen{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(Boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Washing dishes !!");
            hasWorkToDo=false;
        }
    }
}
