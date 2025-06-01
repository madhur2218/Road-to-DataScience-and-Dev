public class Refrigerator {

    private boolean hasWorkTodo;

    public boolean isHasWorkTodo() {
        return hasWorkTodo;
    }

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void orderFood(){
        if(hasWorkTodo){
            System.out.println("Ordering food from refrigerator !!");
            hasWorkTodo = false;
        }
    }
}
