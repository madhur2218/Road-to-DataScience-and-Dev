public class Pizza {
    String size;
    String toppings;
    String deliveryTime;

    Pizza(){
        this("Small");
        System.out.println("Size of pizza is asked");
    }

    Pizza(String size){
        this(size, "olives");
        System.out.println("Size of pizza is "+ size);
    }

    Pizza(String size, String toppings){
        this(size,toppings,"today");
        System.out.println("Size of pizza is "+ size + "and toppings are "+ toppings);
    }

    Pizza(String size, String toppings, String deliveryTime){
        this.size=size;
        this.toppings=toppings;
        this.deliveryTime=deliveryTime;
        System.out.println("Ordering full pizza");
    }
}
