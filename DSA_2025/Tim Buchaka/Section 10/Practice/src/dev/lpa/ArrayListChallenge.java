//package dev.lpa;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//public class ArrayListChallenge {
//
//    static void main() {
//
//        List<GroceryItem> groceryList = new ArrayList<GroceryItem>();
//        Scanner scanner = new Scanner(System.in);
//        boolean flag = true;
//
//        while(flag){
//            ArrayListChallenge.printActions();
//            switch(Integer.parseInt(scanner.nextLine())){
//                case 1 -> addItems(groceryList);
//                case 2 -> removeItems(groceryList);
//                default-> flag=false;
//            }
//            groceryList.sort(Comparator.comparing(e->e.name()));
//        }
//    }
//
//    private static void addItems(List<GroceryItem> groceryList){
//        System.out.println("Add items separated by a comma");
//        //String[] items = scanner.nextLine().split(",");
//
//        for(String item:items){
//            String trimmedItem = item.trim();
//            if(!groceryList.contains(trimmedItem)){
//                groceryList.add(new GroceryItem(trimmedItem));
//            }
//        }
//    }
//
//    private static void removeItems(List<GroceryItem> groceryList){
//        System.out.println("Remove items separated by a comma");
//       // String[] items = scanner.nextLine().split(",");
//
//        //for(String item:items){
//            groceryList.remove(new GroceryItem(item));
//        }
//    }
//
//    private static void printActions(){
//        String textBlock = """
//                0-SHUT DOWN
//                1-ADD ITEMS TO LIST
//                2-REMOVE ITEMS
//
//                ENTER A NUMBER FOR WHICH U WANT TO DO AN ACTION:
//                """;
//        System.out.println(textBlock);
//    }
//}
