public class Triangle extends Shape{

    private double side1, side2, side3;
    private double area;
    private double perimeter;
    
    public Triangle(double side1, double side2, double side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.color = color;
    }
    
    @Override
    public double getArea() {
        area = .25 * (Math.sqrt((side1 + side2 + side3) * (-side1 + side2 + side3) *
                (side1 - side2 + side3) * (side1 + side2 - side3)));
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = side1 +  side2 + side3;
        return perimeter;
    }
    
    public String getColor() {
        return color;
    }
}
