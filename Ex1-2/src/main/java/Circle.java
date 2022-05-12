

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void perimeter() {
        System.out.println("The perimeter of the circle is: "+(2*this.radius*Math.PI));
    }

    @Override
    public void area() {
        System.out.println("The area of the circle is: "+(this.radius*this.radius*Math.PI));
    }
}
