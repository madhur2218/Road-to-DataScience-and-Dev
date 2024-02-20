class Phone {
    static String name;
    int cost;
    String brand;

    public Phone(String name, int cost, String brand) {
        this.name = name;
        this.brand = brand;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getCost() {
        return cost;
    }

    public static void displayText(Phone obj) {
        System.out.println(obj.name + " " + obj.cost + " " + obj.brand);
    }
}

public class StaticVariables {
    public static void main(String[] args) {
        Phone obj1 = new Phone("smartphone", 12, "Samsung");
        Phone obj2 = new Phone("feature phone", 11, "Nokia");
        
        // Calling the static method using the class name
        Phone.displayText(obj1);
        Phone.displayText(obj2);
    }
}
