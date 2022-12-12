import java.util.ArrayList;  

public class ShoppingList {
    
    public Product[] product;
    ArrayList<Product> shoppingList = new ArrayList<Product>();
    public int countProduct = 0;

    public void add(Product product) {
        shoppingList.add(product);
        countProduct += product.getQuantity();
    }

    public int total() {
        return countProduct;
    }

    public String toString() {
        
        String list = "";

        for (Product product : shoppingList){
            list += product.getName()+",";
        }

        return list.substring(0,list.length() -1);
    }

    public static void main(String[] args){
        ShoppingList shoppingList1 = new ShoppingList();
        Product product1 = new Product("milk", 2);
        Product product2 = new Product("apple", 4);

        shoppingList1.add(product1);
        shoppingList1.add(product2);

        System.out.println(shoppingList1.toString());
        System.out.println(shoppingList1.total());
    }
}
