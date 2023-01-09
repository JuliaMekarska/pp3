import java.util.*;

class Product implements Comparable<Product> {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' +
                ", price=" + price + '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product o) {
        if (this.price != o.getPrice()) {
            return this.price - o.getPrice();
        }
        return this.name.compareTo(o.getName());
    }
}

class Main {
    public static void main(String[] args) {
        Product[] products = { new Product("Kwiwi", 5), new Product("Jabłko", 8),
                new Product("Mango", 6), new Product("Banan", 7) };

        Arrays.sort(products);
        System.out.println(Arrays.toString(products));
    }
}