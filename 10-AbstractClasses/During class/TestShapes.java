public class TestShapes {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 5);
        Triangle t1 = new Triangle(3, 3, 3);
        Circle c1 = new Circle(5);

        System.out.println(r1.area());
        System.out.println(t1.area());
        System.out.println(c1.area());

        System.out.println(r1.perimeter());
        System.out.println(t1.perimeter());
        System.out.println(c1.perimeter());
    }
}