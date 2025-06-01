public class DishWasher {
    private boolean hasWorkTodo;

    public boolean isHasWorkTodo() {
        return hasWorkTodo;
    }

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void washDishes(){
        if(hasWorkTodo){
            System.out.println("Washing dishess !!");
            hasWorkTodo = false;
        }
    }
}
