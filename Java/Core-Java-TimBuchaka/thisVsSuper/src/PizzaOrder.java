public class PizzaOrder extends Order{
    private String pizzaType;
    private String size;
    private boolean extraCheeze;

    // Constructor with default extraCheese
    public PizzaOrder(String customerName, String deliveryAddress,String pizzaType,String size){
      this(customerName,deliveryAddress,pizzaType,size,true);
    }

    // Constructor with default address
    public PizzaOrder(String customerName,String pizzaType,String size, Boolean extraCheeze){
        this(customerName,"3/30", pizzaType,size,extraCheeze);
    }

    // Constructor with only name and pizza type (defaults for everything else)
    public PizzaOrder(String customerNmae,String pizzaType){
        this(customerNmae,"3/30 Subahs Nagar",pizzaType,"Big",true);
    }

    public PizzaOrder(String customerName, String customerAddress,String pizzaType,String size,boolean extraCheeze){
        super(customerName,customerAddress);
        this.pizzaType=pizzaType;
        this.size=size;
        this.extraCheeze=extraCheeze;
    }
}
