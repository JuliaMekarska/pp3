public class Circle extends Shape {
    private double r;

    Circle(double r) {
        this.r = r;
    }

    public double perimeter(){
        return 2*Math.PI*this.r;
    }

    public double area(){
        return Math.PI * Math.pow(r, 2);
    }
}