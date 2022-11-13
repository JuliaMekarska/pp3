public class Product {
    String name;
    boolean isVegetarian;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public boolean getIsVegetarian() {
        return isVegetarian;
    }

    public static void main(String[] args) {
        Product p1 = new Product();

        p1.setName("Jogurt");
        p1.setIsVegetarian(true);
        p1.getName();
        p1.getIsVegetarian();
        System.out.println("Product Name: " +  p1.getName());
        System.out.println("Is Vegetarain?: " + p1.getIsVegetarian());
    }

}