public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double perimeter(){
        return this.a + this.b + this.c;
    }

    public double area(){

        return Math.pow(((perimeter()/2) * ((perimeter()/2) - this.a) * ((perimeter()/2) - this.b) * ((perimeter()/2) - this.c)),0.5);
    }
}