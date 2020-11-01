public class Square extends Shape{
    
    private int side;
    
    private int area;
    private int perimeter;
    
    public Square(int side, String color) {
        this.side = side;
        super.color = color;
    }

    @Override
    public double getArea() {
        area = side * side;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 4 * side;
        return perimeter;
    }
    
    public String getColor() {
        return color;
    }
}
