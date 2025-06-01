public class Order {
    protected String customerName;
    protected String customerAddress;

    public Order(String customerName){
        this(customerName,"3/30 Subahsh Nagar");

    }
    public Order(String customerName, String customerAddress){
        this.customerName=customerName;
        this.customerAddress=customerAddress;
    }
}
