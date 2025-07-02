public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String description, double price, String type) {
        this.description = description;
        this.price = price;
        this.type = type;
    }

    //this is a concrete method
    public double getSalesPrice(int qty){
        return qty*price;
    }

    //this is a concrete method
    public void printPricedItems(int qty){
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", qty,price,type,description);

    }

    //this is an abstract method
    public abstract void showDetails();


}
