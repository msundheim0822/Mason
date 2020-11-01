public class Main {
  
    public static void main(String args[]) {
        
        Square square = new Square(5, "Red");
        Triangle triangle = new Triangle(4, 5, 6, "Blue");
        Rectangle rectangle = new Rectangle(10, 6, "Orange");
        Circle circle = new Circle(3, "Green");
        
        System.out.print(square.getArea() + ", ");
        System.out.print(square.getPerimeter() + ", ");
        System.out.println(square.getColor());
        
        System.out.print(triangle.getArea() + ", ");
        System.out.print(triangle.getPerimeter() + ", ");
        System.out.println(triangle.getColor());
        
        System.out.print(rectangle.getArea() + ", ");
        System.out.print(rectangle.getPerimeter() + ", ");
        System.out.println(rectangle.getColor());
        
        System.out.print(circle.getArea() + ", ");
        System.out.print(circle.getPerimeter() + ", ");
        System.out.println(circle.getColor());
    }
}
