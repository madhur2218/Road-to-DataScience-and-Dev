import java.util.ArrayList;



public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 1123,"ABF painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 3343,"JKF painted in 2011"));

        listPorducts();
    }

    public static void listProducts(){
        for(ProductForSale s : storeProducts){
            System.out.println("-".repeat(20));
            s.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex,int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));

    }

    public static void printOrderItem(ArrayList<OrderItem>item){
        double salesTotal = 0;
        for(var i: item){
            item.product().printPricedItem(item.qty());
        }

    }
}
