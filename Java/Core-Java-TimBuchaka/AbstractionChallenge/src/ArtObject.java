public class ArtObject extends ProductForSale{

    public ArtObject(String description, double price, String type) {
        super(description, price, type);
    }

    @Override
    public void showDetails() {
        System.out.println("This "+ type+ " is a beautiful reproduction");
        System.out.println("The price of the piece is: " +price);
        System.out.println("Description: "+ description);
    }


}
