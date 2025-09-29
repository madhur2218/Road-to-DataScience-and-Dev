package dev.lpa;

public record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name){
        this(name,"Dairy",1);
    }

    public GroceryItem(String name, String type, int count){
        this.name= name;
        this.type= type;
        this.count=count;

    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", count=" + count +
                '}';
    }
}
