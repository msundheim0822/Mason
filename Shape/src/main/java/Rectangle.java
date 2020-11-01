public class Rectangle extends Shape{

    private double length;
    private double width;
    
    private double area;
    private double perimeter;
    
    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        super.color = color;
    }
    
    @Override
    public double getArea() {
        area = length * width;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (length + width);
        return perimeter;
    }
    
    public String getColor() {
        return color;
    }
}
