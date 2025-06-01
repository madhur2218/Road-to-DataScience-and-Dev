

public class CoffeeMaker {
    private boolean hasWorkTodo;

    public boolean isHasWorkTodo() {
        return hasWorkTodo;
    }

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void brewCoffee(){
        if(hasWorkTodo){
            System.out.println("brewing coffee !!");
            hasWorkTodo = false;
        }
    }
}
