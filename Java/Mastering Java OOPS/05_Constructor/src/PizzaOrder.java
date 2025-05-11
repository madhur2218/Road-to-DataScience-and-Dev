public class PizzaOrder {
    private String address;
    private String size;
    private String toppings;

    public PizzaOrder(){
        this("3/30 Delhi"); //calls first param constructor
        System.out.println("Step 1: Address confirmed.");
    }

    public PizzaOrder(String address){
        this(address,"Big");//calls 2nd param constructor
    }

    public PizzaOrder(String address, String size){
        this(address,size,"MIX"); // calls 3-param constructor
        System.out.println("Step 3: Toppings confirmed.");
    }

    public PizzaOrder(String address, String size, String toppings) {
        this.address = address;
        this.size = size;
        this.toppings = toppings;
        System.out.println("Step 4: Pizza Order finalized!");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "address='" + address + '\'' +
                ", size='" + size + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}
