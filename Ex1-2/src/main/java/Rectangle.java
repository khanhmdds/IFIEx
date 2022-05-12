

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void perimeter() {
        System.out.println("The perimeter of the rectangle is: "+((this.length+this.width)*2));
    }

    @Override
    public void area() {
        System.out.println("The area of the rectangle is: "+this.length*this.width);
    }
}
