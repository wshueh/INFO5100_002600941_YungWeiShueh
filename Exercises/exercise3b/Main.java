import java.io.*;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(5.0, 12.3, 6.0, 10.2, 8.0);
        Shape shape2 = new Rectangle(15.5, 3.0);
        Shape shape3 = new Circle(5.5);
        Shape shape4 = new Square(4.0);

        
        try {
            // Serialization
            FileOutputStream fileOut = new FileOutputStream("shapes.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(shape1);
            out.writeObject(shape2);
            out.writeObject(shape3);
            out.writeObject(shape4);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in shapes.ser");

            // Deserialization
            FileInputStream fileIn = new FileInputStream("shapes.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Shape deserializedShape1 = (Shape) in.readObject();
            Shape deserializedShape2 = (Shape) in.readObject();
            Shape deserializedShape3 = (Shape) in.readObject();
            Shape deserializedShape4 = (Shape) in.readObject();
            in.close();
            fileIn.close();

            // Print out Area and Perimeter
            System.out.println("Deserialized Shape1 Area: " + deserializedShape1.calculateArea());
            System.out.println("Deserialized Shape2 Area: " + deserializedShape2.calculateArea());
            System.out.println("Deserialized Shape3 Area: " + deserializedShape3.calculateArea());
            System.out.println("Deserialized Shape4 Area: " + deserializedShape4.calculateArea());
            System.out.println("Deserialized Shape1 Perimeter: " + deserializedShape1.calculatePerimeter());
            System.out.println("Deserialized Shape2 Perimeter: " + deserializedShape2.calculatePerimeter());
            System.out.println("Deserialized Shape3 Perimeter: " + deserializedShape3.calculatePerimeter());
            System.out.println("Deserialized Shape4 Perimeter: " + deserializedShape4.calculatePerimeter());
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Shape class not found");
            c.printStackTrace();
            return;
        }
    }
}
