public class Rectangle extends Shape {
    
    private static final long serialVersionUID = 1L;
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length* width;
    }

    public double calculatePerimeter() {
        return (length+ width) * 2;
    }
}
