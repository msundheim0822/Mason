public class Circle extends Shape{

    private double radius;
    
    private double area;
    private double perimeter;
    
    public Circle(double radius, String color) {
        this.radius = radius;
        super.color = color;
    }
    
    @Override
    public double getArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    
    public String getColor() {
        return color;
    }
    
}
