public class SurfaceArea {

    public static int rectangleSurface(int dimensionX, int dimensionY) {
        return dimensionX * dimensionY;
    }
    
    public static double circleSurface(double radius) {
        return 3.14 * (radius * radius);

    }
    
    public  static double triangleSurface(double base, double height) {
        return 0.5 * base * height;

    }
    
    public static void main(String[] args){
        double areaRectangle = rectangleSurface(4,5);
        double areaCircle = circleSurface(3);
        double areaTriangle = triangleSurface(3,4);
        
        System.out.println(areaRectangle);
        System.out.println(areaCircle);
        System.out.println(areaTriangle);
    }
}