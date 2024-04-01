public class Circle extends Shape{
    
    private static final long serialVersionUID = 1L;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius* radius* Math.PI;
    }

    public double calculatePerimeter() {
        return (radius* 2) * Math.PI;
    }
    
}
