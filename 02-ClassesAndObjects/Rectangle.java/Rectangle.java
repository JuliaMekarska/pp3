public class Rectangle {
    int dimensionX;
    int dimensionY;

    public void displayData() {
        int circuit = 2 * dimensionX + 2 * dimensionY;
        int surfaceArea = dimensionX * dimensionY;
        
        System.out.println("Dimensions of this rectangle are: " + dimensionX + ", " + dimensionY);
        System.out.println("The circuit of this rectangle is: " + circuit);
        System.out.println("The surface area of this rectangle is: " + surfaceArea);
    }
    
     public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        
        rectangle1.dimensionX = 3;
        rectangle1.dimensionY = 4;
        rectangle1. displayData();
        
        rectangle1.dimensionX = 2;
        rectangle1.dimensionY = 7;
        rectangle1. displayData();
    }
}