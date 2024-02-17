public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(5.0, 12.3, 6.0, 10.2, 8.0);
        Shape shape2 = new Rectangle(15.5, 3.0);
        Shape shape3 = new Circle(5.5);
        Shape shape4 = new Square(4.0);

        // print out the color
        System.out.println("Shape color: " + Shape.color);

        // print out all areas
        System.out.println("Triangle area: " + shape1.calculateArea());
        System.out.println("Rectangle area: " + shape2.calculateArea());
        System.out.println("Circle area: " + shape3.calculateArea());
        System.out.println("Square area: " + shape4.calculateArea());

        // print out all perimeters
        System.out.println("Triangle perimeter: " + shape1.calculatePerimeter());
        System.out.println("Rectangle perimeter: " + shape2.calculatePerimeter());
        System.out.println("Circle perimeter: " + shape3.calculatePerimeter());
        System.out.println("Square perimeter: " + shape4.calculatePerimeter());
    }
}
